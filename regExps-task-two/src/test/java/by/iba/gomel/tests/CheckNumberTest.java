package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.CheckNumber;

public class CheckNumberTest {

    @Test
    public void testCheckNumber() {
        final CheckNumber checkNumber = new CheckNumber();
        Assert.assertEquals("expected --->", "wrong number", checkNumber.checkNumber("11111 AA-3"));
        Assert.assertEquals("expected --->", "ok", checkNumber.checkNumber("1111 AA-3"));
    }

}
