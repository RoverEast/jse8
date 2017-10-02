package by.iba.gomel;

/**
 * converter class
 */
public class Converter {
    private final String s;
    private final int    a;

    /**
     * converter
     * 
     * @param a
     *            input param
     */
    public Converter(int a) {
        this.s = "int";
        this.a = a;
    }

    /**
     * converter
     * 
     * @param a
     *            input param
     */
    public Converter(byte a) {
        this.s = "byte";
        this.a = a;
    }

    /**
     * converter
     * 
     * @param a
     *            input param
     */
    public Converter(char a) {
        this.s = "char";
        this.a = a;
    }

    /**
     * converter
     * 
     * @param a
     *            input param
     */
    public Converter(long a) {
        this.s = "long";
        this.a = (int) a;
    }

    /**
     * converter
     * 
     * @param a
     *            input param
     */
    public Converter(short a) {
        this.s = "short";
        this.a = a;
    }

    /**
     * converter
     * 
     * @param a
     *            input param
     */
    public Converter(float a) {
        this.s = "float";
        this.a = (int) a;
    }

    /**
     * converter
     * 
     * @param a
     *            input param
     */
    public Converter(double a) {
        this.s = "double";
        this.a = (int) a;
    }

    /**
     * converter
     * 
     * @param a
     *            input param
     */
    public Converter(String a) {
        this.a = Integer.parseInt(a);
        this.s = "string";
    }

    /**
     * nothing
     * 
     * @return a*a
     */
    public final int nothing() {
        return this.a * this.a;
    }

    @Override
    public final String toString() {
        return this.s;
    }

}
