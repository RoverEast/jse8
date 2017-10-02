package by.iba.gomel;

/**
 * check class
 */
public class Check {

    private static final int FIRSTSIZE = 1000_0000;
    private final int[]      progres   = new int[FIRSTSIZE];
    private int              size;
    private int       counter;

    /**
     * check constructor
     * 
     * @param progres
     *            input progres
     */
    public Check(int... progres) {
        for (int i = 0; i < progres.length; i++) {
            this.progres[i] = progres[i];
            this.size++;
        }

    }

    /**
     * check constructor
     */
    public Check() {
        //empty
    }

    /**
     * check
     * 
     * @return true or false
     */
    public final boolean check() {

        if (this.progres.length > 1) {
            final int d = this.progres[1] - this.progres[0];
            for (int i = 1; i < this.size; i++) {
                if (d == (this.progres[i] - this.progres[i - 1])) {
                    this.counter++;
                } else {
                    this.counter = 0;
                }
            }
        }
        return this.counter == this.size - 1;
    }
}
