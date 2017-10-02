package by.iba.gomel;

/**
 * abstract class AnAbstractAnimal
 */
public abstract class AbstractAnimal {

    private final String color;
    private final int size;

    /**
     * Animal constructor
     *
     * @param color
     *            Animal color
     * @param size
     *            Animal size
     */
    public AbstractAnimal(final String color, final int size) {
        this.color = color;
        this.size = size;
    }

    /**
     * getColor meth
     *
     * @return Animal color
     */
    public final String getColor() {
        return this.color;
    }

    /**
     * getSize meth
     *
     * @return Animal size
     */
    public final Integer getSize() {
        return this.size;
    }

    /**
     * move meth
     *
     * @return animal move
     */
    public abstract String move();

    @Override
    public final String toString() {
        return this.move();
    }
}
