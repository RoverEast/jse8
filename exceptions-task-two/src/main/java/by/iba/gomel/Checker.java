package by.iba.gomel;

/**
 * Checker
 */
public class Checker {

    private static final char[] CHARSONE = new char[] {'ф', '2'};
    private static final char[] CHARSTWO = new char[] {'a', 'a'};
    private int b;

    /**
     * constructor
     */
    public Checker() {
        // empty
    }

    /**
     * getB
     *
     * @return b
     */
    public final int getB() {
        return this.b;
    }

    /**
     * getCharsOne
     *
     * @return array
     */
    public final char[] getCharsOne() {
        return Checker.CHARSONE;
    }

    /**
     * getCharsTwo
     *
     * @return array
     */
    public final char[] getCharsTwo() {
        return Checker.CHARSTWO;
    }

    /**
     * sOne
     *
     * @param chars
     *            input chars
     * @return result
     */
    public void sOne(final char[] chars) {
        final NonLetterException nonLetterException = new NonLetterException(null);
        for (final char c : chars) {
            if (nonLetterException.checker(c)) {
                this.b = 0;
            } else {
                this.b = 1;
            }
        }
    }
}
