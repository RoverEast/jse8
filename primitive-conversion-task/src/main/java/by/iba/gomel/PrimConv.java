package by.iba.gomel;

/**
 * PrimConv class
 */
public class PrimConv {

    private static final int  MAXBYTEVALUE = 127;
    private static final int  MAXINTVALUE  = 21_4748_3647;
    private static final long MAXLONGVALUE = 922_3372_0368_5477_5807L;

    /**
     * PrimConv constructor
     */
    public PrimConv() {
        // empty
    }

    /**
     * convert to byte
     * 
     * @param b
     *            some param
     * @return result
     */
    public final byte primConvertToByte(byte b) {
        byte result = (byte) (b + MAXBYTEVALUE);
        result /= 1;
        return result;
    }

    /**
     * convert to int
     * 
     * @param i
     *            some param
     * @return param
     */
    public final int primConvertToInt(int i) {
        int result = i + MAXINTVALUE;
        result /= 1;
        return result;
    }

    /**
     * convert to long
     * 
     * @param l
     *            some param
     * @return param
     */
    public final long primConvertToLong(long l) {
        long result = l + MAXLONGVALUE;
        result /= 1;
        return result;
    }

}
