package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.CheckIsbn;

public class CheckIsbnTest {

    @Test
    public void testCheckIsbn() {
        final CheckIsbn c = new CheckIsbn();
        Assert.assertEquals("expected --->", "ok", c.checkIsbn("978-0-306-40615-7"));
        Assert.assertEquals("expected --->", "ok", c.checkIsbn("979 0 306 40615 7"));
        Assert.assertEquals("expected --->", "wrong number", c.checkIsbn("950-0-306-40615-7"));
    }

}
