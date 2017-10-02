package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.FullDeck;

public class FullDeckTest {

    @Test
    public void testGetFullDeckSize() {
        final FullDeck fullDeck = new FullDeck();
        fullDeck.initDeck();
        Assert.assertEquals("expected --->", 52, fullDeck.getFullDeckSize());
    }

}
