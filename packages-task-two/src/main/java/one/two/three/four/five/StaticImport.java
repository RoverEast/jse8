package one.two.three.four.five;

/**
 * Static Import Class
 */
public final class StaticImport {

    /**
     * first static field
     */
    public static final boolean FIRSTFIELD = true;

    /**
     * StaticImport constructor
     */

    private StaticImport() {
        // empty

    }

    /**
     * first meth
     *
     * @return true
     */
    public static boolean firstMeth() {
        return true;
    }

    /**
     * get firstField
     *
     * @return firstField
     */
    public static boolean isFirstfield() {
        return StaticImport.FIRSTFIELD;
    }
}
