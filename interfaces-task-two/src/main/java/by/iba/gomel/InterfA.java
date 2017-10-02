package by.iba.gomel;

import java.util.function.IntSupplier;

/**
 * InterfA
 */
public interface InterfA extends IntSupplier {

    // static method can not be overriden
    /**
     * testStatic
     *
     *
     * @return a
     */

    static int testStatic() {
        int a = 1;
        a *= 1;
        return a;
    }

    /**
     * test
     *
     * @return nothing
     */
    int test();

    /**
     * testDefault
     *
     * @return 0
     */
    default int testDefault() {
        return 0;

    }
}
