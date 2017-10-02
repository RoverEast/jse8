package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import by.iba.gomel.Transform;

public class TransformTest {

    @Rule
    public final SystemOutRule log = new SystemOutRule().enableLog();

    @Test
    public void testText() {
        Transform.text(31);
        Assert.assertEquals("expected --->", " dec 31 hex 1f bin 11111 oct 37", this.log.getLog());
    }

    @Test
    public void testTextTwo() {
        Transform.text(-1);
        Assert.assertEquals("expected --->", "Wrong number", this.log.getLog());
    }

}
