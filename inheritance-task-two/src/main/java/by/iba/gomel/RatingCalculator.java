package by.iba.gomel;

import java.util.Arrays;

/**
 * RatingCalculator
 */
public class RatingCalculator {

    private static final int TWO = 2;
    protected Score[] player = new Score[] {new Score(), new Score(), new Score()};

    /**
     * RatingCalculator
     */
    public RatingCalculator() {
        this.player[0].setPlayerId(0);
        this.player[0].setScore(0);
        this.player[1].setPlayerId(1);
        this.player[1].setScore(0);
        this.player[RatingCalculator.TWO].setPlayerId(RatingCalculator.TWO);
        this.player[RatingCalculator.TWO].setScore(0);
    }

    /**
     * getScores
     *
     * @return array
     */
    public Score[] getScores() {
        for (int i = 0; i < this.player.length; i++) {
            for (int j = 1; j < this.player.length; j++) {
                if (this.player[j].getScore() > this.player[j - 1].getScore()) {
                    final Score temp = this.player[j];
                    this.player[j] = this.player[j - 1];
                    this.player[j - 1] = temp;
                }
            }
        }
        return this.player;
    }

    /**
     * initPlayers
     */
    public void initPlayers() {
        for (int i = 0; i < this.player.length; i++) {
            this.player[i].setPlayerId(i);
            this.player[i].setScore(0);
        }
    }

    /**
     * list
     * 
     * @return list
     */
    public final String list() {
        return Arrays.toString(this.getScores());

    }
}
