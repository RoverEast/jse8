package by.iba.gomel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Arithmetic class
 */
public final class ArithmeticDemo {
    
    /**
     * Logger. *
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(ArithmeticDemo.class);
    private static final int    TWO    = 2;
    private static final int    SEVEN  = 7;
    private static final int    EIGHT  = 8;

    /**
     * ArithmeticDemo constructor.
     */
    private ArithmeticDemo() {
        // empty
    }

    /**
     * main method
     * 
     * @param args
     *            some params
     */
    public static void main(String[] args) {
        // result is now 3
        int result = 1 + TWO;
        final String s1 = Integer.toString(result);
        // result is now 2
        result--;
        final String s2 = Integer.toString(result);
        // result is now 4
        result *= TWO;
        final String s3 = Integer.toString(result);
        // result is now 2
        result /= TWO;
        final String s4 = Integer.toString(result);
        // result is now 10
        result += EIGHT;
        // result is now 3
        result %= SEVEN;
        final String s5 = Integer.toString(result);
        ArithmeticDemo.LOGGER.info(s1 + s2 + s3 + s4 + s5);
    }

}
