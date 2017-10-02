package by.iba.gomel;

import java.io.FileInputStream;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * class SymbCounter
 */
public class SymbCounter {

    /**
     * Logger.
     *
     * For future reference - comments on purpose of specific field should go here.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(SymbCounter.class);

    /**
     * SymbCounter constructor
     */
    public SymbCounter() {
        // empty
    }

    /**
     * symbCounter meth
     *
     * @param symb
     *            current symb
     * @param fileName
     *            file Name
     * @return ret counter
     * @throws IOException
     *             throw e
     */
    public int symbCounter(final char symb, final String fileName) throws IOException {
        int counter = 0;
        try (FileInputStream input = new FileInputStream(fileName)) {
            int data = input.read();
            while (data != -1) {
                if ((char) data == symb) {
                    counter++;
                } else {
                    counter *= 1;
                }
                data = input.read();
            }
        } catch (final IOException e) {
            SymbCounter.LOGGER.info(e.getMessage(), e);
        }
        return counter;

    }
}
