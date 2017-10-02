package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.Check;

public class CheckTest {

    @Test
    public void testCheck() {
        Check c1 = new Check(0, 2, 4);
        Assert.assertTrue("expected true",c1.check());
        Check c2 = new Check(0, 2, 5);
        Assert.assertFalse("expected false",c2.check());
        Check c3 = new Check();
        Assert.assertFalse("expected false",c3.check());
    }

}
