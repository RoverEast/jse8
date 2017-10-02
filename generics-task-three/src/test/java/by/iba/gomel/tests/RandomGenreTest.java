package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.RandomGenre;

public class RandomGenreTest {

    @Test
    public void testTakeRandFiction() {
        final RandomGenre randomGenre = new RandomGenre(0);
        Assert.assertEquals("expected --->", "whodunit, locked room mystery, cozy",
                randomGenre.takeRandFiction());
    }

}
