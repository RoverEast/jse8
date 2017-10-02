package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.Finder;

public class FinderTest {

    @Test
    public void testTakeAllText() {
        final Finder finder = new Finder("a[df (da{dad)((}dasd)](da");
        Assert.assertEquals("expected --->", "():da dasd\n" + "[]:df  \n" + "{}:dad ",
                finder.takeAllText());
    }

}
