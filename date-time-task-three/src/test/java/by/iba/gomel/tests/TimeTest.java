package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import by.iba.gomel.Time;

public class TimeTest {

    @Rule
    public final SystemOutRule log = new SystemOutRule().enableLog();

    @Test
    public void testCheckerOne() {
        final Time time = new Time(9, 6);
        time.checker();
        Assert.assertEquals("expected --->", "Break", this.log.getLog());
    }

    @Test
    public void testCheckerTwo() {
        final Time time = new Time(9, 5);
        time.checker();
        Assert.assertEquals("expected --->", "Lesson", this.log.getLog());
    }

}
