package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.Simple;

public class SimpleTest {

    @SuppressWarnings("deprecation")
    @Test
    public void testGetConst() {
        // warning is here
        // CONST is deprecated
        // solution : add @SuppressWarnings("deprecation")
        Assert.assertEquals("expected--->", 1, new Simple().getA());
    }

}
