package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.Run;

public class RunTest {

    @Test
    public void testFirst() {
        Run vars = new Run();
        Assert.assertEquals("method should return 0", 0, vars.first());
    }

    @Test
    public void testSecond() {
        Run vars = new Run();
        Assert.assertEquals("method should return 1", 1, vars.second());
    }

    @Test
    public void testGetFirstF() {
        Run vars = new Run();
        Assert.assertEquals("method should return 1", 0, vars.getFirstF());
    }

    @Test
    public void testGetSecondF() {
        Run vars = new Run();
        Assert.assertEquals("method should return 1", 1, vars.getSecondF());
    }

}
