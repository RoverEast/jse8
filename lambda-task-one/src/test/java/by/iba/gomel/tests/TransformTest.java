package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.Tranform;

public class TransformTest {

    @Test
    public void testGetInt() {
        Assert.assertEquals("expected --->", 1, new Tranform().getInt());
    }

    @Test
    public void testLow() {
        Assert.assertEquals("expected --->", "asd", new Tranform().low("ASD"));
    }

    @Test
    public void testTrim() {
        Assert.assertEquals("expected --->", "asd", new Tranform().trim("  asd   "));
    }

    @Test
    public void testUp() {
        Assert.assertEquals("expected --->", "ASD", new Tranform().up("asd"));
    }

}
