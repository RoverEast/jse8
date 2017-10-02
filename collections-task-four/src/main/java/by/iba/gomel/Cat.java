package by.iba.gomel;

/**
 * class Cat
 */
public class Cat extends AbstractAnimal {

    /**
     * Cat constructor
     *
     * @param color
     *            Cat color
     * @param size
     *            Cat size
     */
    public Cat(final String color, final int size) {
        super(color, size);
    }

    @Override
    public final String move() {
        return "I can walk";
    }
}
