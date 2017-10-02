package by.iba.gomel;

/**
 * Main class
 */
public class Run {

    private static int firstF;
    private static final  int SECONDF = 1;
    private static final int FORLOC = 0;

    /**
     * Run constructor
     */
    public Run() {
        // empty
    }

    /**
     * Return 1 local var 
     * @return smth
     */
    public final int first() {
        // compilation problem: The local variable may not have been initialized
        // solution : initialize local variable
        int floc = FORLOC;
        floc /=1;
        return floc;
    }

    /**
     * Return 2 local var
     * @return smthS
     */
    public final int second() {
        int sloc = SECONDF;
        sloc /=1;
        return sloc;
    }

    /**
     * Get first field
     * @return smth
     */
    public static int getFirstF() {
        return firstF;
    }

    /**
     * Get second field
     * @return smth
     */
    public static int getSecondF() {
        return SECONDF;
    }

}
