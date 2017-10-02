package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.Counter;

public class CounterTest {

    @Test
    public void testEqualsDigits() {
        final Counter<Integer> counter = new Counter<>(0);
        Assert.assertEquals("expected--->", 2,
                counter.equalsDigits(counter.createCollection(), counter.getCheckPredicate()));

    }

    @Test
    public void testOddValueCounterOne() {
        final Counter<Long> counter = new Counter<>((long) 0);
        Assert.assertEquals("expected--->", 2,
                counter.oddValueCounter(counter.createCollection(), counter.getCheckPredicate()));
    }

    @Test
    public void testOddValueCounterTwo() {
        final Counter<Integer> counter = new Counter<>(0);
        Assert.assertEquals("expected--->", 2,
                counter.oddValueCounter(counter.createCollection(), counter.getCheckPredicate()));
    }

}
