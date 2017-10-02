package by.iba.gomel;

/**
 * class Fish
 */
public class Fish extends AbstractAnimal {

    /**
     * Fish constructor
     *
     * @param color
     *            Fish color
     * @param size
     *            Fish size
     */
    public Fish(final String color, final int size) {
        super(color, size);
    }

    @Override
    public final String move() {
        return "I can swim";
    }
}
