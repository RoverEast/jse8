package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.Finder;

public class FinderTest {

    @Test
    public void testTakeInt() {
        final Finder finder = new Finder();
        Assert.assertEquals("expected --->", "1", finder.takeInt("name1.txt"));
    }

    @Test
    public void testTakeIntThree() {
        final Finder finder = new Finder();
        Assert.assertEquals("expected --->", "did not find", finder.takeInt("name3.txt"));
    }

    @Test
    public void testTakeIntTwo() {
        final Finder finder = new Finder();
        Assert.assertEquals("expected --->", "1", finder.takeInt("name2.txt"));
    }

}
