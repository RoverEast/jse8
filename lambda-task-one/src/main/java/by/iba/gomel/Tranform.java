package by.iba.gomel;

import java.util.Locale;

/**
 * Tranform class
 */
public class Tranform {

    private final ToLowerCaseTransformer toLowerCase = s -> s.toLowerCase(Locale.ENGLISH);
    private final ToUpperCaseTransformer toUpperCase = s -> s.toUpperCase(Locale.ENGLISH);
    private final SpaceRemover spaceRemover = s -> s.trim();

    /**
     * constructor
     */
    public Tranform() {
        // empty
    }

    /**
     * getInt method
     *
     * @return 1 val
     */
    public final int getInt() {
        return this.spaceRemover.getAsInt();
    }

    /**
     * to lowcase
     *
     * @param s
     *            input string
     * @return result string
     */
    public final String low(final String s) {
        return this.toLowerCase.transform(s);
    }

    /**
     * trim string
     *
     * @param s
     *            input string
     * @return result string
     */
    public final String trim(final String s) {
        return this.spaceRemover.transform(s);
    }

    /**
     * to upcase
     *
     * @param s
     *            input string
     * @return result string
     */
    public final String up(final String s) {
        return this.toUpperCase.transform(s);
    }
}
