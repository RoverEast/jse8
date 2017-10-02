package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.Arrays;


public class ArraysTest {

    @Test
    public void testGetFirst() {
        Arrays arr = new Arrays();
        arr.firstInit();
        Assert.assertEquals("expected 0" ,0, arr.getFirst(0));
    }

    @Test
    public void testGetSecond() {
        Arrays arr = new Arrays();
        Assert.assertEquals("expected 1" ,1, arr.getSecond(0));
    }

    @Test
    public void testGetThird() {
        Arrays arr = new Arrays();
        arr.thirdInit();
        Assert.assertEquals("expected x" ,"x", arr.getThird(0, 0));
    }

    @Test
    public void testGetFourth() {
        Arrays arr = new Arrays();
        Assert.assertEquals("expected q" ,"q", arr.getFourth(0, 0));
    }

}
