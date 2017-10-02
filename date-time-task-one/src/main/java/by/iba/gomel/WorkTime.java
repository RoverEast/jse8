package by.iba.gomel;

import java.time.DayOfWeek;
import java.time.LocalDate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * WorkTime class
 */
public class WorkTime {

    /**
     * Logger.
     *
     * For future reference - comments on purpose of specific field should go here.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(WorkTime.class);
    private final LocalDate date;

    /**
     * constructor
     *
     * @param y
     *            year
     * @param m
     *            month
     * @param d
     *            day
     */
    public WorkTime(final int y, final int m, final int d) {
        this.date = LocalDate.of(y, m, d);
    }

    /**
     * work
     */
    public void work() {
        if (DayOfWeek.SATURDAY.equals(this.date.getDayOfWeek()) || this.lastDay()) {

            WorkTime.LOGGER.info("It is open till 3 pm");
        } else if (DayOfWeek.SUNDAY.equals(this.date.getDayOfWeek())) {
            WorkTime.LOGGER.info("It is do not work");
        } else {
            WorkTime.LOGGER.info("It is open till 7 pm");
        }
    }

    private boolean lastDay() {
        return 1 == this.date.plusDays(1).getDayOfMonth();

    }
}
