package by.iba.gomel;

/**
 * implement class
 */
public class Implement implements CharSequence {

    private String s;

    /**
     * empty constructor
     *
     */
    public Implement() {
        // empty
    }

    /**
     * backWords
     *
     * @return string
     */
    public String backWords() {
        final StringBuilder builder = new StringBuilder();
        for (int i = this.s.length() - 1; i >= 0; i--) {
            final char ch = this.s.charAt(i);
            builder.append(ch);
        }
        return builder.toString();
    }

    /**
     * charAt
     */
    @Override
    public char charAt(final int index) {
        return 0;
    }

    /**
     * length
     */
    @Override
    public int length() {
        return 0;
    }

    /**
     * set string
     *
     * @param s
     *            string
     */
    public void setS(final String s) {
        this.s = s;
    }

    /**
     * CharSequence
     */
    @Override
    public CharSequence subSequence(final int start, final int end) {
        return null;
    }
}
