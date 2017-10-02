package by.iba.gomel;

/**
 * Score
 */
public class Score {

    protected int scorre;
    protected int playerId;

    /**
     * getPlayerId
     *
     * @return playerId
     */
    public int getPlayerId() {
        return this.playerId;
    }

    /**
     * getScore
     *
     * @return score
     */
    public int getScore() {
        return this.scorre;
    }

    /**
     * setPlayerId
     *
     * @param playerId
     *            input param
     */
    public void setPlayerId(final int playerId) {
        this.playerId = playerId;
    }

    /**
     * setScore
     *
     * @param score
     *            input param
     */
    public void setScore(final int score) {
        this.scorre = score;
    }

    /**
     * toString
     */
    @Override
    public String toString() {
        return "Score [score=" + this.scorre + ", playerId=" + this.playerId + "]";
    }

}
