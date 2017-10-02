package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.PrimConv;

public class PrimConvTest {

    @Test
    public void testPrimConvertToByte() {
        PrimConv p = new PrimConv();
        Assert.assertEquals("should return -29",-29, p.primConvertToByte((byte) 100));
    }

    @Test
    public void testPrimConvertToInt() {
        PrimConv p = new PrimConv();
        Assert.assertEquals("should return -2147483549",-2147483549, p.primConvertToInt(100));
    }

    @Test
    public void testPrimConvertToLong() {
        PrimConv p = new PrimConv();
        Assert.assertEquals("should return 9223372036854775709",-9223372036854775709L, p.primConvertToLong((long) 100));

    }

}
