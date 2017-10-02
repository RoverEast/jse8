package by.iba.gomel;

/**
 * Shift class
 */
public class Shift {

    private static final byte FIRST  = 0b0100_0000;
    private static final byte SECOND = (byte) 0b1100_0000;

    /**
     * Shift constructor, empty
     */
    public Shift() {
        // empty
    }

    /**
     * get first variable
     * 
     * @return value
     */
    public final byte getFirst() {
        return FIRST;
    }

    /**
     * get first variable
     * 
     * @return value
     */
    public final byte getSecond() {
        return SECOND;
    }

    /**
     * right shift
     * 
     * @param value
     *            input param
     * @return value
     */
    public final byte rightShift(byte value) {
        
        return (byte) (value >> 1);
    }

    /**
     * left shift
     * 
     * @param value
     *            input param
     * @return value
     */
    public final byte leftShift(byte value) {
        
        return (byte) (value << 1);
    }

    /**
     * unsigned right shift
     * 
     * @param value
     *            input param
     * @return value
     */
    public final int unsignedRightShift(int value) {
        
        return value >>> 1;
    }

}
