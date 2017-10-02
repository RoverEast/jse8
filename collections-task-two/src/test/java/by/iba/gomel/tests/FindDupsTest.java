package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.FindDups;

public class FindDupsTest {

    @Test
    public void testFindDups() {
        final FindDups findDups = new FindDups();
        final String[] a = new String[] {"aA", "Ba"};
        Assert.assertEquals("expected --->", "2 distinct words: [aA, Ba]", findDups.findDups(a));
    }

}
