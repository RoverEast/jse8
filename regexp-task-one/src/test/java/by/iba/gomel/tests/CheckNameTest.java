package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.CheckName;

public class CheckNameTest {

    @Test
    public void testCheckName() {
        final CheckName checkName = new CheckName();
        Assert.assertEquals("expected --->", "ok", checkName.checkName("as as"));
        Assert.assertEquals("expected --->", "not ok", checkName.checkName("asd as"));
    }

}
