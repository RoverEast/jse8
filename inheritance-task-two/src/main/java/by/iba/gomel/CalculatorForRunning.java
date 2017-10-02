package by.iba.gomel;

/**
 * CalculatorForRunning
 */
public class CalculatorForRunning extends RatingCalculator implements RateByMultiplePoints {

    /**
     * ratePlayer
     */
    @Override
    public void ratePlayer(final int playerid, final double[] points) {
        int sum = 0;
        for (final double point : points) {
            sum += point;
        }
        this.player[playerid].setScore(sum);
    }
}
