package by.iba.gomel;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * transform class
 */
public final class Transform {

    private static final int THIRTYTWO = 32;
    private static final Logger LOGGER = LoggerFactory.getLogger(Transform.class);

    /**
     * constructor
     */
    private Transform() {
        // empty
    }

    /**
     * text
     *
     * @param number
     *            input number
     * @return result
     */
    public static void text(final int number) {
        final String hex = String.format(Locale.US, "%s", Integer.toHexString(number));
        final String bin = String.format("%s", Integer.toBinaryString(number));
        final String oct = String.format("%s", Integer.toOctalString(number));

        if ((number > 0) && (number < Transform.THIRTYTWO)) {
            Transform.LOGGER.info(" dec {} hex {} bin {} oct {}", +number, hex, bin, oct);
        } else {
            Transform.LOGGER.info("Wrong number");
        }

    }

}
