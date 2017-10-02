package by.iba.gomel;

import java.util.Iterator;
import java.util.NoSuchElementException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * DataStructure class
 */
public class DataStructure {

    // Create an array
    private static final int SIZE = 15;
    private static final int TWO = 2;
    /**
     * Logger.
     *
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(DataStructure.class);

    private final int[] arrayOfInts = new int[DataStructure.SIZE];

    /**
     * Default constructor. Initializes {@link #arrayOfInts} of {@link #SIZE} with ints starting
     * from 0 up to {@link #SIZE}.
     */
    public DataStructure() {
        // fill the array with ascending integer values
        for (int i = 0; i < DataStructure.SIZE; i++) {
            this.arrayOfInts[i] = i;
        }
    }

    /**
     * Fills the {@link #arrayOfInts} with int values and prints out only values of even indices.
     *
     * @param args
     *            method parameters. Not used in this implementation.
     */
    public static void main(final String[] args) {

        final DataStructure dataStructure = new DataStructure();
        dataStructure.printEven();

        final EvenIterator anonym = dataStructure.new EvenIterator() {

            @Override
            public void setNextIndex(final int i) {
                this.nextIndex = 1;
            }
        };
        anonym.setNextIndex(0);
        dataStructure.print(anonym);
    }

    /**
     * print
     *
     * @param iterator
     *            input param
     */
    public void print(final DataStructureIterator iterator) {

        while (iterator.hasNext()) {
            final int a = (int) iterator.next();
            if ((a % DataStructure.TWO) == 1) {
                DataStructure.LOGGER.info("{} ", a);
            }
        }
        DataStructure.LOGGER.info("");
    }

    /**
     * Prints out values of event indices of the {@link #arrayOfInts}.
     */
    public final void printEven() {

        final DataStructureIterator iterator = this.new EvenIterator();
        while (iterator.hasNext()) {
            DataStructure.LOGGER.info("{} ", iterator.next());
        }
        DataStructure.LOGGER.info("");
    }

    // Inner class implements the DataStructureIterator interface,
    // which extends the Iterator interface

    interface DataStructureIterator extends Iterator {
    }

    private class EvenIterator implements DataStructureIterator {

        // Start stepping through the array from the beginning
        protected int nextIndex;

        @Override
        public boolean hasNext() {

            // Check if the current element is the last in the array
            return this.nextIndex <= (DataStructure.SIZE - 1);
        }

        @Override
        public Integer next() {
            if (!this.hasNext()) {
                throw new NoSuchElementException();
            }
            // Record a value of an even index of the array
            Integer retValue;
            retValue = Integer.valueOf(DataStructure.this.arrayOfInts[this.nextIndex]);
            // Get the next even element
            this.nextIndex += DataStructure.TWO;
            return retValue;
        }

        @Override
        public void remove() {
            // Do nothing

        }

        public void setNextIndex(final int i) {
            // Do nothing
        }

    }
}
