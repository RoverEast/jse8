package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import by.iba.gomel.Main;

public class MainTest {

    @Rule
    public final SystemOutRule log = new SystemOutRule().enableLog();

    @Test
    public void testCheckFirst() {
        final String[] args = {"1,0", "1e2", "3,0", "4,754"};
        Main.main(args);
        Assert.assertEquals("expected -->", "108.754", this.log.getLog());

    }

    @Test
    public void testCheckSecond() {
        final String[] argsTwo = {"1.0", "1e2", "3.0", "4.754"};
        Main.main(argsTwo);
        Assert.assertEquals("expected -->", "108.754", this.log.getLog());
    }
}
