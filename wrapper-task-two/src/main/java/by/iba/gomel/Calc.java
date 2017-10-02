package by.iba.gomel;

/**
 * calc Class
 */
public class Calc {

    private final double x;
    private final double y;

    /**
     * constructor
     */
    public Calc() {
        this(0, 0);
    }

    /**
     * constructor
     *
     * @param x
     *            param
     * @param y
     *            param
     */
    public Calc(final double x, final double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * calc
     *
     * @return result
     */
    public Number calc() {
        return Math.pow(1 - Math.tan(this.x), Math.pow(Math.tan(this.x), -1))
                + Math.cos(this.x - this.y);
    }
}
