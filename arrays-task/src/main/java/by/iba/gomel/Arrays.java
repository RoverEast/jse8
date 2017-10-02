package by.iba.gomel;

/**
 * Arrays class
 */
public class Arrays {

    private static final int      SIZE   = 3;
    private int[]                 first  = new int[SIZE];
    private static final int[]    second = {1, 2, 3};
    private char[][]              third  = new char[SIZE][SIZE];
    private static final char[][] fourth = {{'q', 'w', 'e'}, {'a', 's', 'd'}, {'z', 'x', 'c'}};

    /**
     * Arrays constructor
     */
    public Arrays() {
        // empty
    }

    /**
     * initialize first array
     */
    public final void firstInit() {

        int x = 0;

        for (int i = 0; i < SIZE; i++) {

            this.first[i] = x;
            x++;
        }
    }

    /**
     * initialize third array
     */
    public final void thirdInit() {

        for (int i = 0; i < SIZE; i++) {

            for (int j = 0; j < SIZE; j++) {

                this.third[i][j] = 'x';

            }
        }
    }

    /**
     * return element from array
     * 
     * @param i
     *            some param
     * @param j
     *            some param
     * @param k
     *            some param
     * @return smth
     */
    public final int getFirst(int i) {
        return this.first[i];
    }

    /**
     * return element from array
     * 
     * @param i
     *            some param
     * @param j
     *            some param
     * @param k
     *            some param
     * @return smth
     */
    public final int getSecond(int i) {
        return second[i];
    }

    /**
     * return element from array
     * 
     * @param i
     *            some param
     * @param j
     *            some param
     * @return smth
     */
    public final String getThird(int i, int j) {
        String s = Character.toString(this.third[i][j]);
        s = s + "";
        return s;
    }

    /**
     * return element from array
     * 
     * @param i
     *            some param
     * @param j
     *            some param
     * @return smth
     */
    public final String getFourth(int i, int j) {
        String s = Character.toString(fourth[i][j]);
        s = s + "";
        return s;
    }

}
