package by.iba.gomel;

/**
 * dog class
 */
public class Dog {

    private String name;
    private String says;

    /**
     * empty constructor
     */
    public Dog() {
        // empty
    }

    /**
     * get name
     * 
     * @return name
     */
    public final String getName() {
        return this.name;
    }

    /**
     * set name
     * 
     * @param name
     *            input param
     */
    public final void setName(String name) {
        this.name = name;
    }

    /**
     * get says
     * 
     * @return says
     */
    public final String getSays() {
        return this.says;
    }

    /**
     * set says
     * 
     * @param says
     *            input param
     */
    public final void setSays(String says) {
        this.says = says;
    }

}
