package by.iba.gomel;

/**
 * class Circle
 */
public class Circle implements Shape {

    private int radius;

    /**
     * constructor
     */
    public Circle() {
        // empty
    }

    /**
     *
     * @param radius
     *            radius
     */
    public Circle(final int radius) {
        this.radius = radius;
    }

    /**
     * getArea
     */
    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    /**
     * getAsDouble
     */
    @Override
    public double getAsDouble() {
        return 0;
    }

}
