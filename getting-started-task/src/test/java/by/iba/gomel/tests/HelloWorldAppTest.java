package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import by.iba.gomel.HelloWorldApp;

public class HelloWorldAppTest {

    @Rule
    public final SystemOutRule log = new SystemOutRule().enableLog();

    @Test
    public void testMain() {
        HelloWorldApp.main(new String[] {});
        Assert.assertEquals("Dima Cherepyanko! string should be in system out", "Dima Cherepyanko!",
                this.log.getLog());
    }
    

}
