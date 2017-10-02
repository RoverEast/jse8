package by.iba.gomel;

/**
 * RateByMultiplePoints
 */
@FunctionalInterface
public interface RateByMultiplePoints {
    /**
     * ratePlayer
     *
     * @param playerid
     *            input param
     * @param points
     *            input param
     */
    void ratePlayer(int playerid, double[] points);
}
