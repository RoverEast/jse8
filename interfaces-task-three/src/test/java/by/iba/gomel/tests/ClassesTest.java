package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.First;
import by.iba.gomel.Log;
import by.iba.gomel.Second;

public class ClassesTest {

    @Test
    public void testAll() {
        final First first = new First();
        final Second second = new Second();
        Assert.assertEquals("expected 1", "1", first.log("1"));
        Assert.assertEquals("expected 0", "0", second.log("1221"));
        Assert.assertEquals("expected 01", "01", Log.log("0", "1"));
    }

}
