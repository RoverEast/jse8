package by.iba.gomel;

/**
 * NonLetterException
 */
public class NonLetterException extends RuntimeException {

    /**
     * constructor
     */
    public NonLetterException() {
        super();
    }

    /**
     * constructor
     *
     * @param message
     *            input message
     */
    public NonLetterException(final String message) {
        super(message);
    }

    /**
     * checker
     *
     * @param chars
     *            input chars
     * @return String
     */
    public boolean checker(final char chars) {
        return ((chars >= 'a') && (chars <= 'z')) || ((chars >= 'A') && (chars <= 'Z'));

    }

}
