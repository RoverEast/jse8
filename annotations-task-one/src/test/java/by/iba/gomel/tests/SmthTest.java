package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.Smth;

public class SmthTest {

    @Test
    public void testSmth() {
        final Smth smth = new Smth();
        Assert.assertEquals("expected--->", 1, smth.smth());
    }

}
