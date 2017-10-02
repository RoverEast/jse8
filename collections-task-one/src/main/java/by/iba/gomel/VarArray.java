package by.iba.gomel;

import java.util.Arrays;
import java.util.Collections;

/**
 * class VarArray
 */
public class VarArray {

    /**
     * empty constructor
     */
    public VarArray() {
        // empty
    }

    /**
     * varArr meth
     *
     * @param arr
     *            method with variable number of arguments
     * @return an array of its arguments in random order
     */
    public final String varArr(final Object[] arr) {
        Collections.shuffle(Arrays.asList(arr));
        return Arrays.toString(arr);
    }
}
