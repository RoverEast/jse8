package by.iba.gomel;

/**
 * class CheckPredicate
 *
 * @param <T>
 *            the parameter of the class
 */
public class CheckPredicate<T> implements UnaryPredicate<T> {

    /**
     * CheckPredicate constructor
     */
    public CheckPredicate() {
        // empty
    }

    @Override
    public final boolean checkT(final T t) {
        return t instanceof Number;
    }

}
