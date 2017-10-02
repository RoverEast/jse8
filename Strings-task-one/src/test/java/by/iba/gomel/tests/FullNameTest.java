package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.FullName;

public class FullNameTest {

    @Test
    public void testTakeInitials() {
        final FullName fullName = new FullName("Dima Charapianka");
        Assert.assertEquals("expected --->", "D.C", fullName.takeInitials());
        final FullName fullNameTwo = new FullName("Aaa");
        Assert.assertEquals("expected --->", "full name not found", fullNameTwo.takeInitials());
        final FullName fullNameThree = new FullName("");
        Assert.assertEquals("expected --->", "name not found", fullNameThree.takeInitials());
    }

}
