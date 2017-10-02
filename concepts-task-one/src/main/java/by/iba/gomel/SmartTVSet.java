package by.iba.gomel;

/**
 * TV class
 */

public class SmartTVSet implements TVSet {

    private int channel = 1;

    /**
     * SmartTVSet constructor
     */
    public SmartTVSet() {
        // empty
    }

    /**
     * nextChannel method
     */
    @Override
    public final int nextChannel() {

        return this.channel++;
    }

    /**
     * prevousChannel method
     */
    @Override
    public final int prevousChannel() {

        return this.channel--;
    }

}
