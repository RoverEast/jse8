package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.Imp;
import by.iba.gomel.InterfA;
import by.iba.gomel.InterfB;

public class ImpTest {

    @Test
    public void testImp() {
        final Imp imp = new Imp();
        Assert.assertEquals("expected 1", 1, imp.test());
        Assert.assertEquals("expected 1", 1, imp.testDefault());
        Assert.assertEquals("expected 1", 1, InterfA.testStatic());
        Assert.assertEquals("expected 1", 1, InterfB.testStatic());
    }

}
