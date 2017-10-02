package by.iba.gomel;

/**
 * AbstractRectangle
 */
public abstract class AbstractRectangle implements Shape, Cloneable {

    protected int height;

    /**
     * constructor
     */
    public AbstractRectangle() {
        // empty
    }

    /**
     * constructor
     * 
     * @param height
     *            height
     */
    public AbstractRectangle(final int height) {
        this.height = height;
    }

    /**
     * getHeight
     * 
     * @return Height
     */
    public int getHeight() {
        return this.height;
    }

    /**
     * getWidth
     * 
     * @return Width
     */
    public abstract int getWidth();

}
