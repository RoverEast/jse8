package by.iba.gomel;

/**
 * notenough exception
 */
public class NotEnough extends RuntimeException {

    /**
     * constructor
     */
    public NotEnough() {
        super();
    }

    /**
     * constructor
     * 
     * @param message
     *            input message
     */
    public NotEnough(final String message) {
        super(message);
    }

    /**
     * checker
     *
     * @param args
     *            args
     * @return true/false
     */
    public boolean checker(final String[] args) {
        return args.length > 1;

    }
}
