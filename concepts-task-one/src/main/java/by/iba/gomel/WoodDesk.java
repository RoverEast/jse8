package by.iba.gomel;

/**
 * desk class
 */
public class WoodDesk implements Desk {

    private static final int WEIGHT = 10;
    private static final int HEIGHT = 30;

    /**
     * empty constructor
     */
    public WoodDesk() {
        // empty
    }

    /**
     * 
     * return weight
     */
    @Override
    public final int getWeight() {

        return WoodDesk.WEIGHT;
    }

    /**
     * return height
     */
    @Override
    public final int getHeight() {

        return WoodDesk.HEIGHT;
    }

}
