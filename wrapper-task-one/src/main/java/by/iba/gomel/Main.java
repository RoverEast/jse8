package by.iba.gomel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Main class
 */
public final class Main {

    /**
     * Logger.
     *
     * For future reference - comments on purpose of specific field should go here.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    /**
     * s
     */

    /**
     * constructor
     */
    private Main() {
        // empty
    }

    /**
     * main method
     *
     * @param args
     *            args
     */
    public static void main(final String[] args) {
        double sum = 0;
        final NotEnough n = new NotEnough();
        if (n.checker(args)) {
            for (final String arg : args) {
                sum += Double.parseDouble(arg.replace(',', '.'));
            }
        } else {
            sum = 0;
        }
        try {
            if ((int) sum == 0) {
                throw new NotEnough("not enough");
            } else {
                final String s = String.valueOf(sum);
                Main.LOGGER.info(s);
            }
        } catch (final NotEnough e) {
            Main.LOGGER.info(e.getMessage(), e);
        }
    }
}
