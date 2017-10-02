package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.SumOfIntegers;

public class SumOfIntegersTest {

    @Test
    public void testSum() {
        final SumOfIntegers sumOfIntegers = new SumOfIntegers();
        Assert.assertEquals("expected --->", 6, sumOfIntegers.sum(3));
    }
}
