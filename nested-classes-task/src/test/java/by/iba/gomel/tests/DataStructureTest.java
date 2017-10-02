package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import by.iba.gomel.DataStructure;

public class DataStructureTest {

    @Rule
    public final SystemOutRule log = new SystemOutRule().enableLog();

    @Test
    public void testMain() {
        DataStructure.main(null);
        Assert.assertEquals("expected ---> first numbers is even, last numbers is odd",
                "0 2 4 6 8 10 12 14 1 3 5 7 9 11 13 ", this.log.getLog());
    }
}
