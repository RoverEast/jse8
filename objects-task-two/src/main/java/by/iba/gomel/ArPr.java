package by.iba.gomel;

/**
 * class
 */
public class ArPr {
    private int                 firstEl;
    private int                 step;
    private final int           size;
    private static final int    FIRSTSIZE = 10_000_0000;
    private static final String NP        = "no progression";
    private final int[]         progress  = new int[FIRSTSIZE];

    /**
     * constructor
     * 
     * @param firstEl
     *            first element
     * @param step
     *            step
     * @param size
     *            size
     */
    public ArPr(int firstEl, int step, int size) {
        this.firstEl = firstEl;
        this.step = step;
        this.size = size;
        int k = 0;
        for (int i = 0; i < size; i++) {
            this.progress[i] = firstEl + (k * step);
            k++;
        }
    }

    /**
     * constructor
     */
    public ArPr() {
        this.size = 0;
    }

    /**
     * show Size
     * 
     * @return size
     */
    public final String showSize() {
        String s;
        if (this.size > 0) {
            s = String.valueOf(this.size);
            s +="";
            return s;
        } else {
            return NP;
        }
    }

    /**
     * show Value
     * 
     * @param i
     *            number in progression
     * @return value
     */
    public final String showValue(int i) {
        if (this.size > 0 && i <= this.size) {
            this.firstEl *= 1;
            String s = String.valueOf(this.firstEl);
            s +="";
            return s;
        } else {
            return NP;
        }
    }

    /**
     * show First
     * 
     * @return first element
     */
    public final String showFirst() {
        if (this.size > 0) {
            this.progress[0] *= 1;
            String s = String.valueOf(this.progress[0]);
            s +="";
            return s;
        } else {
            return NP;
        }
    }

    /**
     * show Last
     * 
     * @return last element
     */
    public final String showLast() {
        if (this.size > 0) {
            this.progress[this.size - 1] *= 1;
            String s = String.valueOf(this.progress[this.size - 1]);
            s +="";
            return s;
        } else {
            return NP;
        }
    }

    /**
     * show Step
     * 
     * @return step
     */
    public final String showStep() {
        if (this.size > 0) {
            this.step *= 1;
            String s = String.valueOf(this.step);
            s +="";
            return s;
        } else {
            return NP;
        }
    }

    /**
     * show Sum
     * 
     * @return sum
     */
    public final String showSum() {
        if (this.size > 0) {
            int sum = 0;
            for (int i = 0; i < this.size; i++) {
                sum += this.progress[i];
            }
            sum *= 1;
            String s = String.valueOf(sum);
            s +="";
            return s;
        } else {
            return NP;
        }
    }

}
