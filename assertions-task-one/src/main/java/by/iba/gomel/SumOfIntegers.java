package by.iba.gomel;

/**
 * class SumOfIntegers
 */
public class SumOfIntegers {

    /**
     * constructor
     */
    public SumOfIntegers() {
        // empty
    }

    /**
     * sum method
     *
     * @param value
     *            input val
     * @return sum val
     */
    public final int sum(final int value) {
        assert (value > 0);
        int sum = 0;
        for (int i = 0; i <= value; i++) {
            sum += i;
        }
        return sum;
    }
}
