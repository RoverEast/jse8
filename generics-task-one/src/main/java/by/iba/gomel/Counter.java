package by.iba.gomel;

import java.util.ArrayList;
import java.util.Collection;

/**
 * class Counter
 *
 * @param <T>
 *            the parameter of the class
 */
public class Counter<T extends Number> {

    private static final int FIRST = 313;
    private static final int SECOND = 11;
    private static final int THIRD = 12;
    private static final int TWO = 2;
    private static final int TEN = 10;
    private final T t;

    /**
     * constructor with t
     *
     * @param t
     *            t param
     */
    public Counter(final T t) {
        this.t = t;
    }

    private static int takeFirstDigit(final int element) {
        int el = element;
        if (el < Counter.TEN) {
            return -1;
        }
        while (el >= Counter.TEN) {
            el = el / Counter.TEN;
        }
        return el;
    }

    /**
     * createCollection meth
     *
     * @return ret col
     */
    public final Collection<T> createCollection() {
        final Collection<Number> col = new ArrayList<>();
        col.add(Counter.FIRST);
        col.add(Counter.SECOND);
        col.add(Counter.THIRD);
        return (Collection<T>) col;
    }

    /**
     * equalsDigits meth
     *
     * @param elements
     *            input col
     * @param checkPredicate
     *            input obj
     * @return ret sum
     */
    public final int equalsDigits(final Collection<T> elements,
            final UnaryPredicate<T> checkPredicate) {
        int sum = 0;
        for (final Object element2 : elements) {
            final int element = (int) element2;
            final int lastDigit = element % 10;
            final int firstDigit = Counter.takeFirstDigit(element);
            if (lastDigit == firstDigit) {
                sum++;
            }
        }
        if (checkPredicate.checkT(this.t)) {
            return sum;
        }
        return sum - 1;
    }

    /**
     * getCheckPredicate meth
     *
     * @return ret obj
     */
    public final UnaryPredicate<T> getCheckPredicate() {
        return new CheckPredicate<>();
    }

    /**
     * getT meth
     *
     * @return ret t
     */
    public final T getT() {
        return this.t;
    }

    /**
     * oddValueCounter meth
     *
     * @param elements
     *            input col
     * @param checkPredicate
     *            input obj
     * @return ret sum
     */
    public final int oddValueCounter(final Collection<T> elements,
            final UnaryPredicate<T> checkPredicate) {
        int sum = 0;
        for (final Object element2 : elements) {
            final int element = (int) element2;
            if ((element % Counter.TWO) != 0) {
                sum++;
            }
        }
        if (checkPredicate.checkT(this.t)) {
            return sum;
        }
        return sum - 1;
    }

}
