package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.Checker;
import by.iba.gomel.NonLetterException;

public class CheckerTest {

    @Test
    public void testCheckFirst() {
        new NonLetterException("a");
        final Checker checker = new Checker();
        checker.sOne(checker.getCharsTwo());
        Assert.assertEquals("expected -->", 0, checker.getB());
    }

    @Test
    public void testCheckSecond() {
        final Checker checker = new Checker();
        checker.sOne(checker.getCharsOne());
        Assert.assertEquals("expected -->", 1, checker.getB());
    }

}
