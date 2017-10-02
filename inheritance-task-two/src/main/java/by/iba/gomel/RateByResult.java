package by.iba.gomel;

/**
 * RateByResult
 */
@FunctionalInterface
public interface RateByResult {
    /**
     * setPlayerResult
     *
     * @param playerId
     *            input param
     * @param result
     *            input param
     */
    void setPlayerResult(int playerId, double result);
}
