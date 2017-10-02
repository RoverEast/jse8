package by.iba.gomel;

/**
 * sort array class
 */
public final class SortArray {

    public static final int SIZE = 10;
    private int[]           arr  = new int[SIZE];

    /**
     * empty constructor
     */
    public SortArray() {
        // empty
    }

    /**
     * initialize array
     */
    public void arrInit() {
        for (int i = 0; i < this.arr.length; i++) {
            this.arr[i] = i;
        }
    }

    /**
     * sort array
     */
    public void sortArr() {
        for (int i = 0; i < this.arr.length; i++) {
            for (int j = 1; j < this.arr.length; j++) {
                if (this.arr[j] > this.arr[j - 1]) {
                    final int temp = this.arr[j];
                    this.arr[j] = this.arr[j - 1];
                    this.arr[j - 1] = temp;
                }
            }
        }
    }

    /**
     * get element
     * 
     * @param i
     *            element number
     * @return element
     */
    public int getElement(int i) {
        return this.arr[i];
    }
}
