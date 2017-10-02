package by.iba.gomel;

/**
 * road bycicle class
 */
public class RoadBycicle implements Bycicle {

    private int cadence;
    private int speed;
    private int gear = 1;
    private int amort;

    /**
     * RoadBycicle constructor
     */
    public RoadBycicle() {
        // empty
    }

    // The compiler will now require that methods
    // changeCadence, changeGear, speedUp, and applyBrakes
    // all be implemented. Compilation will fail if those
    // methods are missing from this class.

    /**
     * changeCadence method
     */
    @Override
    public final void changeCadence(int newValue) {

        this.cadence = newValue;
    }

    /**
     * changeGear method
     */
    @Override
    public final void changeGear(int newValue) {

        this.gear = newValue;
    }

    /**
     * speedUp method
     */
    @Override
    public final void speedUp(int increment) {

        this.speed = this.speed + increment;
    }

    /**
     * applyBreaks method
     */
    @Override
    public final void applyBrakes(int decrement) {

        this.speed = this.speed - decrement;
    }

    /**
     * getCadence method
     */
    public final int getCadence() {

        return this.cadence;
    }

    /**
     * getSpeed method
     */
    public final int getSpeed() {

        return this.speed;
    }

    /**
     * getGear method
     */
    public final int getGear() {

        return this.gear;
    }

    /**
     * getAmort method
     * 
     * @return smth
     */
    public final int getAmort() {

        return this.amort;
    }

}
