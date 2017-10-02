package by.iba.gomel;

/**
 * CalculatorForBoxing
 */
public class CalculatorForBoxing extends RatingCalculator
        implements Disqulification, RateByAccumulatingPoints {

    /**
     * addPoints
     */
    @Override
    public void addPoints(final int playerId, final int points) {
        this.player[playerId].setScore(this.player[playerId].getScore() + points);
    }

    /**
     * disqualifi
     */
    @Override
    public void disqualifi(final int playerId) {
        this.player[playerId].setScore(0);
    }

    /**
     * getAsInt
     */
    @Override
    public int getAsInt() {
        return 0;
    }

    /**
     * knockout
     */
    @Override
    public void knockout(final int playerId) {
        this.player[playerId].setScore(this.player[playerId].getScore() - 1);
    }
}
