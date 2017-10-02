package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.Judge;
import by.iba.gomel.RatingCalculator;

public class RatingCalculatorTest {

    @Test
    public void testGetScores() {
        final RatingCalculator rc = new RatingCalculator();
        final Judge judge = new Judge();
        rc.initPlayers();
        judge.rate(rc);
        rc.getScores();
        Assert.assertEquals("expected ->",
                "[Score [score=18, playerId=2], Score [score=16, playerId=1], Score [score=14, playerId=0]]",
                rc.list());
    }

}
