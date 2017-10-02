package by.iba.gomel;

/**
 * class Imp
 */
public class Imp implements InterfA, InterfB {

    @Override
    public final int getAsInt() {
        return 0;
    }

    /**
     * test meth
     */
    @Override
    public int test() {
        return 1;
    }

    /**
     * test default meth
     */
    @Override
    public int testDefault() {
        return 1;

    }

}
