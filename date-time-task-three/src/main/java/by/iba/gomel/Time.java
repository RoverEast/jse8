package by.iba.gomel;

import java.time.Duration;
import java.time.LocalTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Time
 */
public class Time {

    /**
     * Logger.
     *
     * For future reference - comments on purpose of specific field should go here.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(Time.class);
    private static final int FOURTYFIVE = 45;
    private static final int FIFTYFIVE = 55;
    private final LocalTime startLessons = LocalTime.of(8, 20);
    private final LocalTime endLessons = LocalTime.of(21, 0);
    private final LocalTime now;

    /**
     * constructor
     *
     * @param hour
     *            hour
     * @param minutes
     *            minutes
     */
    public Time(final int hour, final int minutes) {
        this.now = LocalTime.of(hour, minutes);
    }

    /**
     * checker
     */
    public void checker() {
        long duration = Duration.between(this.startLessons, this.now).toMinutes();
        while (duration > Time.FIFTYFIVE) {
            duration -= Time.FIFTYFIVE;
        }
        if (this.now.isBefore(this.endLessons) && this.now.isAfter(this.startLessons)) {

            if (duration > Time.FOURTYFIVE) {
                Time.LOGGER.info("Break");
            } else {
                Time.LOGGER.info("Lesson");
            }
        } else {
            Time.LOGGER.info("School does not work");
        }

    }
}
