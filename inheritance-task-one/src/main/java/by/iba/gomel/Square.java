package by.iba.gomel;

/**
 * Square
 */
public class Square extends AbstractRectangle {

    /**
     * constructor
     */
    public Square() {
        super();
    }

    /**
     * constructor
     *
     * @param height
     *            height
     */
    public Square(final int height) {
        super(height);
    }

    /**
     * equals
     */
    @Override
    public boolean equals(final Object obj) {
        return super.equals(obj);
    }

    /**
     * getArea
     */
    @Override
    public double getArea() {
        return (double) this.getWidth() * (double) this.getHeight();
    }

    /**
     * getAsDouble
     */
    @Override
    public double getAsDouble() {
        return 0;
    }

    /**
     * getWidth
     */
    @Override
    public int getWidth() {
        return this.getHeight();
    }

    /**
     * hashCode
     */
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    /**
     * toString
     */
    @Override
    public String toString() {
        return "Square [getArea()=" + this.getArea() + ", getWidth()=" + this.getWidth()
                + ", getHeight()=" + this.getHeight() + ", getClass()=" + this.getClass()
                + ", hashCode()=" + this.hashCode() + ", toString()=" + super.toString() + "]";
    }

}
