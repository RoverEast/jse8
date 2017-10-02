package by.iba.gomel;

/**
 * class Bird
 */
public class Bird extends AbstractAnimal {

    /**
     * Bird constructor
     *
     * @param color
     *            Bird color
     * @param size
     *            Bird size
     */
    public Bird(final String color, final int size) {
        super(color, size);
    }

    @Override
    public final String move() {
        return "I can fly";
    }
}
