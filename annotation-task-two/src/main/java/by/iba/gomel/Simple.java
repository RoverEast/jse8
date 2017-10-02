package by.iba.gomel;

/**
 * simple class
 */
public final class Simple {

    /**
     * const @deprecated(task)
     */
    @Deprecated
    private final int a;

    /**
     * constructor @deprecated(task)
     */
    @Deprecated
    public Simple() {
        this.a = 1;
    }

    /**
     * get a a
     *
     * @deprecated(task) @return a
     */
    @Deprecated
    public int getA() {
        return this.a;
    }
}
