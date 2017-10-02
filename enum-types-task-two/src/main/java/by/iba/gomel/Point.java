package by.iba.gomel;

/**
 * class Point
 */
public class Point {

    private int x;
    private int y;

    /**
     * constructor
     */
    public Point() {
        // empty
    }

    /**
     * getX meth
     *
     * @return x position
     */
    public final int getX() {
        return this.x;
    }

    /**
     * getY meth
     *
     * @return y position
     */
    public final int getY() {
        return this.y;
    }

    /**
     * setX meth
     *
     * @param x
     *            x position
     */
    public final void setX(final int x) {
        this.x = x;
    }

    /**
     * setY meth
     *
     * @param y
     *            y position
     */
    public final void setY(final int y) {
        this.y = y;
    }

    /**
     * toString meth
     */
    @Override
    public String toString() {
        return "Point [x=" + this.x + ", y=" + this.y + "]";
    }

}
