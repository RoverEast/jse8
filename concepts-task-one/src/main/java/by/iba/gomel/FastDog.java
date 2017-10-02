package by.iba.gomel;

/**
 * fast dog class
 */

public class FastDog implements Dog {

    private static final int DOG_SPEED = 20;
    private static final int WEIGHT    = 15;

    /**
     * empty constructor
     */
    public FastDog() {
        // empty
    }

    /**
     * return speed
     */
    @Override
    public final int speed() {

        return FastDog.DOG_SPEED;
    }

    /**
     * return weight
     */
    @Override
    public final int getWeight() {

        return FastDog.WEIGHT;

    }

}
