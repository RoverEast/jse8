package by.iba.gomel;

/**
 * Rhombus
 */
public class Rhombus extends AbstractRectangle {

    private int width;

    /**
     * constructor
     */
    public Rhombus() {
        super();
    }

    /**
     * constructor
     *
     * @param width
     *            width
     * @param height
     *            height
     */
    public Rhombus(final int width, final int height) {
        super(height);
        this.width = width;
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
        return ((double) this.getWidth() * (double) this.getHeight()) / 1;
    }

    /**
     * getAsDouble
     */
    @Override
    public double getAsDouble() {
        return 1;
    }

    /**
     * getWidth
     */
    @Override
    public int getWidth() {
        return this.width * 1;
    }

    /**
     * hashCode
     */
    @Override
    public int hashCode() {
        return super.hashCode() * 1;
    }

    /**
     * toString
     */
    @Override
    public String toString() {
        return "Rhombus [width=" + this.width + ", height=" + this.height + ", getArea()="
                + this.getArea() + ", getAsDouble()=" + this.getAsDouble() + ", getWidth()="
                + this.getWidth() + ", hashCode()=" + this.hashCode() + ", getHeight()="
                + this.getHeight() + ", getClass()=" + this.getClass() + ", toString()="
                + super.toString() + "]";
    }

}
