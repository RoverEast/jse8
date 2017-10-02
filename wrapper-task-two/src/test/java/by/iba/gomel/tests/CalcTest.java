package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.Calc;

public class CalcTest {

    @Test
    public void testCalc() {
        Assert.assertEquals("expected --->", 1.1288012364859665, new Calc(2, 1).calc());
    }

    @Test
    public void testCalcTwo() {
        Assert.assertEquals("expected --->", Double.NaN, new Calc().calc());
    }

}
