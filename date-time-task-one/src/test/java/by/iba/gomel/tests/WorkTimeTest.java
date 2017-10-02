package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import by.iba.gomel.WorkTime;

public class WorkTimeTest {

    @Rule
    public final SystemOutRule log = new SystemOutRule().enableLog();

    @Test
    public void testWorkFour() {
        final WorkTime workTime4 = new WorkTime(2017, 3, 24);
        workTime4.work();
        Assert.assertEquals("expected --->", "It is open till 7 pm", this.log.getLog());
    }

    @Test
    public void testWorkOne() {
        final WorkTime workTime = new WorkTime(2017, 3, 26);
        workTime.work();
        Assert.assertEquals("expected --->", "It is do not work", this.log.getLog());
    }

    @Test
    public void testWorkThree() {
        final WorkTime workTime3 = new WorkTime(2017, 3, 31);
        workTime3.work();
        Assert.assertEquals("expected --->", "It is open till 3 pm", this.log.getLog());
    }

    @Test
    public void testWorkTwo() {
        final WorkTime workTime2 = new WorkTime(2017, 3, 25);
        workTime2.work();
        Assert.assertEquals("expected --->", "It is open till 3 pm", this.log.getLog());
    }

}
