package by.iba.gomel;

/**
 * interface log
 */
public interface Log {

    /**
     * log
     *
     * @param level
     *            input
     * @param message
     *            input
     * @return level+message
     */
    static String log(final String level, final String message) {
        return level + message;
    }

    // static method can not be overriden
    /**
     * log
     *
     * @param message
     *            input
     * @return message
     */
    default String log(final String message) {
        return message;
    }
}
