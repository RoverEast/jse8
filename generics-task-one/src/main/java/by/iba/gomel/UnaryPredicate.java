package by.iba.gomel;

/**
 * interface UnaryPredicate
 * 
 * @param <T>
 *            the parameter of the class
 */
public interface UnaryPredicate<T> {
    /**
     * checkT meth
     *
     * @param t
     *            t param
     * @return ret result
     */
    boolean checkT(T t);
}
