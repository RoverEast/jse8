package by.iba.gomel;

/**
 * class BinOperation
 */
public class BinOperation {

    private static final ExtIntBinaryOperator EXT = (r, l) -> (int) Math.pow(r, l);

    /**
     * BinOperation constructor
     */
    public BinOperation() {
        // empty
    }

    /**
     * binOp meth m
     *
     * @param r
     *            first val
     * @param l
     *            sec val
     * @return first raise to sec
     */
    public final int binOp(final int r, final int l) {
        return BinOperation.EXT.applyAsInt(r, l);
    }
}
