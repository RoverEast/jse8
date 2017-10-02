package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.Shift;

public class ShiftTest {

    @Test
    public void testRightShift() {
        Shift shift = new Shift();
        Assert.assertEquals("method should return -32",-32, shift.rightShift(shift.getSecond()));
    }

    @Test
    public void testLeftShift() {
        Shift shift = new Shift();
        Assert.assertEquals("method should return -128",-128, shift.leftShift(shift.getSecond()));
    }

    @Test
    public void testUnsignedRightShift() {
        Shift shift = new Shift();
        Assert.assertEquals("method should return 2147483616",2147483616, shift.unsignedRightShift(shift.getSecond()));
    }

}
