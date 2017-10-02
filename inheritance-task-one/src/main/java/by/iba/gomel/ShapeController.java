package by.iba.gomel;

/**
 * ShapeController
 */
public class ShapeController {

    private static final int TWO = 2;
    private static final int THREE = 3;
    private static final int FOUR = 4;
    private static final int FIVE = 5;
    private final Shape[] shapes = new Shape[ShapeController.FIVE];

    /**
     * calculateArea
     *
     * @return area
     */
    public int calculateArea() {

        int sum = 0;
        for (final Shape s : this.shapes) {
            sum += s.getArea();
        }

        return sum;
    }

    /**
     * initArray
     */
    public void initArray() {
        this.shapes[0] = new Circle();
        this.shapes[1] = new Square();
        this.shapes[ShapeController.TWO] = new Square();
        this.shapes[ShapeController.THREE] = new Rhombus();
        this.shapes[ShapeController.FOUR] = new Rhombus();

    }

    /**
     * initArray
     *
     * @param size
     *            size
     */
    public void initArray(final int size) {
        this.shapes[0] = new Circle(size);
        this.shapes[1] = new Square(size);
        this.shapes[ShapeController.TWO] = new Square(size);
        this.shapes[ShapeController.THREE] = new Rhombus(size, size);
        this.shapes[ShapeController.FOUR] = new Rhombus(size, size);
    }
}
