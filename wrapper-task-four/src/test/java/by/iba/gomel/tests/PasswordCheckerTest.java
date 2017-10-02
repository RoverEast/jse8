package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.PasswordChecker;

public class PasswordCheckerTest {

    @Test
    public void testCheckPassword() {
        final PasswordChecker passwordChecker = new PasswordChecker("Aaaaaaa4");
        Assert.assertTrue("expected true", passwordChecker.checkPassword());
    }

    @Test
    public void testCheckPasswordTwo() {
        final PasswordChecker passwordChecker = new PasswordChecker();
        Assert.assertFalse("expected false", passwordChecker.checkPassword());
    }

}
