package by.iba.gomel;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Museum class
 */
public class Museum {

    /**
     * Logger.
     *
     * For future reference - comments on purpose of specific field should go here.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(Museum.class);

    private static final int ZERO = 0;
    private static final int THREE = 3;
    private static final int FOUR = 4;
    private static final int SEVEN = 7;
    private static final int TEN = 10;
    private static final int SEVENTEEN = 17;
    private static final int TWENTY = 20;
    private static final int THIRTY = 30;
    private static final int NINETY = 90;
    private static final int NINETYFIVE = 95;
    private static final int HTWENTYFIVE = 125;
    private final DateTimeFormatter formatter;
    private LocalDate date;
    private LocalTime time;
    private ZoneId departZone;
    private final ZoneId arrivingZone = ZoneId.of("Europe/London");
    private ZonedDateTime zonedDateTime;

    /**
     * constructor
     */
    public Museum() {
        this.formatter = DateTimeFormatter.ofPattern("d MMMM yyyy | hh:mm a | Z");
    }

    /**
     * fromTo
     *
     * @param s
     *            zone
     * @return message
     */
    public String fromTo(final String s) {
        this.setDepartZone(s);
        this.zonedDateTime = ZonedDateTime.of(this.date, this.time, this.getDepartZone());
        if ("Europe/Minsk".equals(this.getDZ())) {
            this.zonedDateTime = this.zonedDateTime.withZoneSameInstant(this.arrivingZone);
            this.zonedDateTime = this.zonedDateTime.plusMinutes(Museum.NINETY);
            this.zonedDateTime = this.zonedDateTime.plusHours(Museum.THREE);
        } else if ("Europe/Moscow".equals(this.getDZ())) {
            this.zonedDateTime = this.zonedDateTime.withZoneSameInstant(this.arrivingZone);
            this.zonedDateTime = this.zonedDateTime.plusMinutes(Museum.NINETYFIVE);
            this.zonedDateTime = this.zonedDateTime.plusHours(Museum.FOUR);
        } else if ("America/New_York".equals(this.getDZ())) {
            this.zonedDateTime = this.zonedDateTime.withZoneSameInstant(this.arrivingZone);
            this.zonedDateTime = this.zonedDateTime.plusMinutes(Museum.HTWENTYFIVE);
            this.zonedDateTime = this.zonedDateTime.plusHours(Museum.SEVEN);
        }
        return this.zonedDateTime.format(this.formatter);

    }

    /**
     * getDateTime
     *
     * @return datetime
     */
    public String getDateTime() {
        return this.zonedDateTime.format(this.formatter);
    }

    /**
     * getDepartZone
     *
     * @return departZone
     */
    public ZoneId getDepartZone() {
        return this.departZone;
    }

    /**
     * getDZ
     *
     * @return getDZ
     */
    public String getDZ() {
        return this.departZone.toString();
    }

    /**
     * setDate
     *
     * @param year
     *            year
     * @param month
     *            month
     * @param day
     *            day
     */
    public void setDate(final int year, final int month, final int day) {
        this.date = LocalDate.of(year, month, day);
    }

    /**
     * setTime
     *
     * @param hours
     *            hours
     * @param minutes
     *            minutes
     */
    public void setTime(final int hours, final int minutes) {
        this.time = LocalTime.of(hours, minutes);
    }

    /**
     * workTime
     */
    public void workTime() {
        LocalTime closeTime;
        final LocalTime openTime = LocalTime.of(Museum.TEN, Museum.ZERO);
        if (DayOfWeek.FRIDAY.equals(this.zonedDateTime.getDayOfWeek())) {
            closeTime = LocalTime.of(Museum.TWENTY, Museum.THIRTY);
        } else {
            closeTime = LocalTime.of(Museum.SEVENTEEN, Museum.THIRTY);
        }
        if (closeTime.isAfter(LocalTime.from(this.zonedDateTime))
                && openTime.isBefore(LocalTime.from(this.zonedDateTime))) {
            Museum.LOGGER.info("It is open");
        } else {
            Museum.LOGGER.info("It is close");
        }
    }

    private void setDepartZone(final String s) {
        this.departZone = ZoneId.of(s);
    }
}
