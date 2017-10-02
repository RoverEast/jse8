package by.iba.gomel;

/**
 * array class
 */
public class Array {

    private static final int SIZE  = 3;
    private char[][][]       first = new char[SIZE][SIZE][SIZE];

    /**
     * empty constructor
     */
    public Array() {
        // empty
    }

    /**
     * all elements = a
     */
    public final void initArFirst() {

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                for (int k = 0; k < SIZE; k++) {
                    this.first[i][j][k] = 'a';
                }
            }
        }
    }

    /**
     * one element = b
     */
    public final void initArSecond() {

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                for (int k = 0; k < SIZE; k++) {
                    this.first[i][j][k] = 'a';
                }
            }
        }
        this.first[0][0][0] = 'b';
    }

    /**
     * check row in array
     * 
     * @param j
     *            row number
     * @return result
     */
    public final boolean chekRow(int j) {
        int counter = 0;
        for (int i = 1; i < SIZE; i++) {

            if (this.first[i][j][j] == this.first[i - 1][j][j]) {
                counter++;
            }

        }
        if (counter == SIZE - 1) {
            return counter == SIZE - 1;
        } else {
            return false;
        }

    }

    /**
     * check Column in array
     * 
     * @param i
     *            Column number
     * @return result
     */
    public final boolean checkColumnResult(int i) {
        int counter = 0;
        for (int j = 0; j < SIZE; j++) {
            for (int k = 1; k < SIZE; k++) {
                if (this.first[i][j][k] == this.first[i][j][k - 1]) {
                    counter++;
                }
            }
        }

        for (int j = 1; j < SIZE; j++) {
            if (this.first[i][j - 1][SIZE - 1] == this.first[i][j][0]) {
                counter++;
            }
        }
        if (counter == SIZE * SIZE - 1) {
            return counter == SIZE * SIZE - 1;
        } else {
            return false;
        }

    }

    /**
     * check diagonal in array
     * 
     * @return result
     */
    public final boolean checkDiag() {
        int counter = 0;
        for (int i = 1; i < SIZE; i++) {
            for (int j = 1; j < SIZE; j++) {
                for (int k = 1; k < SIZE; k++) {
                    counter += this.checkD(i, j, k);
                }
            }
        }
        if (counter == SIZE - 1) {
            return counter == SIZE - 1;
        } else {
            return false;
        }
    }

    /**
     * 
     * @param i
     *            input param
     * @param j
     *            input param
     * @param k
     *            input param
     * @return 1
     */
    public final int checkD(int i, int j, int k) {
        int counter = 0;
        if ((i == j) && (j == k) && (this.first[i][j][k] == this.first[i - 1][j - 1][k - 1])) {
            counter++;
        }
        return counter;
    }
}
