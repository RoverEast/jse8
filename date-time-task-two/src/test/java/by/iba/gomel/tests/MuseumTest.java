package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import by.iba.gomel.Museum;

public class MuseumTest {

    @Rule
    public final SystemOutRule log = new SystemOutRule().enableLog();

    @Test
    public void testWorkTimeOne() {
        final Museum museum = new Museum();
        museum.setDate(2015, 03, 6);
        museum.setTime(15, 10);
        museum.fromTo("America/New_York");
        museum.workTime();
        Assert.assertEquals("expected --->", "It is close", this.log.getLog());
    }

    @Test
    public void testWorkTimeTwo() {
        final Museum museum = new Museum();
        museum.setDate(2015, 03, 6);
        museum.setTime(6, 10);
        museum.fromTo("America/New_York");
        museum.workTime();
        Assert.assertEquals("expected --->", "It is open", this.log.getLog());
    }

}
