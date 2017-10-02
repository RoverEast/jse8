package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

public class DebTest {

    @Test
    public void testClasses() {
        debug.Deb Deb1 = new  debug.Deb();
        debugoff.Deb Deb2 = new  debugoff.Deb();
        Assert.assertEquals("expected string INFO","INFO", Deb1.debug());
        Assert.assertEquals("expected string WARNING","WARNING", Deb2.debug());
    }

}
