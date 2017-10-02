package by.iba.gomel;

/**
 * bike interface
 */
public interface Bycicle {

    /**
     * change cadence
     * 
     * @param newValue
     *            some param
     * 
     */
    void changeCadence(int newValue);

    /**
     * change gear
     * 
     * @param newValue
     *            some param
     */
    void changeGear(int newValue);

    /**
     * increment speed
     * 
     * @param increment
     *            some param
     */
    void speedUp(int increment);

    /**
     * decrement speed
     * 
     * @param decrement
     *            some param
     */
    void applyBrakes(int decrement);
}
