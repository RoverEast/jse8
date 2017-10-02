package by.iba.gomel;

import java.util.function.IntSupplier;

/**
 * Disqulification
 */

public interface Disqulification extends IntSupplier {

    /**
     * disqualifi
     *
     * @param playerId
     *            nput param
     */
    void disqualifi(int playerId);
}
