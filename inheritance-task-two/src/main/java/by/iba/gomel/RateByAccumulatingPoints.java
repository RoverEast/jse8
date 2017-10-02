package by.iba.gomel;

/**
 * RateByAccumulatingPoints
 */
public interface RateByAccumulatingPoints {
    /**
     *
     * @param playerId
     *            input param
     * @param points
     *            input param
     */
    void addPoints(int playerId, int points);

    /**
     * knockout
     *
     * @param playerId
     *            input param
     */
    void knockout(int playerId);
}
