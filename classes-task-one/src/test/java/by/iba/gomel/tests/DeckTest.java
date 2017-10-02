package by.iba.gomel.tests;

import java.security.SecureRandom;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.Deck;

public class DeckTest extends Deck {

    @Test
    public void testTakeCard() {
        Deck deck = new Deck();
        SecureRandom r = new SecureRandom();
        final int number = r.nextInt(deck.SUIT.length * deck.RANK.length);
        deck.initDeck();
        Assert.assertEquals("card check",deck.singleCard[number].toString(), deck.takeCard(number));
    }

}
