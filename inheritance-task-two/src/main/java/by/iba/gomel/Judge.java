package by.iba.gomel;

/**
 * Judge
 */
public class Judge {

    private static final int TWO = 2;
    private static final int THREE = 3;
    private static final int FOUR = 4;
    private static final int FIVE = 5;
    private final CalculatorForBoxing calculatorForBoxing = new CalculatorForBoxing();
    private final CalculatorForFigueScating calculatorForFigueScating = new CalculatorForFigueScating();
    private final CalculatorForRunning calculatorForRunning = new CalculatorForRunning();
    private final RatingCalculator ratingCalculator = new RatingCalculator();

    /**
     * rate
     *
     * @param rc
     *            input param
     */
    public void rate(final RatingCalculator rc) {
        this.calculatorForBoxing.getAsInt();
        this.calculatorForBoxing.addPoints(0, Judge.TWO);
        this.calculatorForBoxing.addPoints(1, Judge.TWO);
        this.calculatorForBoxing.addPoints(Judge.TWO, Judge.TWO);
        this.calculatorForRunning.ratePlayer(0, new double[] {1, Judge.TWO, Judge.THREE});
        this.calculatorForRunning.ratePlayer(1, new double[] {1, Judge.TWO, Judge.FOUR});
        this.calculatorForRunning.ratePlayer(Judge.TWO, new double[] {1, Judge.TWO, Judge.FIVE});
        this.calculatorForFigueScating.ratePlayer(0, new double[] {1, Judge.TWO, Judge.THREE});
        this.calculatorForFigueScating.ratePlayer(1, new double[] {1, Judge.TWO, Judge.FOUR});
        this.calculatorForFigueScating.ratePlayer(Judge.TWO,
                new double[] {1, Judge.TWO, Judge.FIVE});
        for (int i = 0; i < this.ratingCalculator.player.length; i++) {
            rc.player[i].setScore(this.calculatorForBoxing.player[i].getScore()
                    + this.calculatorForFigueScating.player[i].getScore()
                    + this.calculatorForRunning.player[i].getScore());
        }

    }
}
