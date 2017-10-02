package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.Work;

public class WorkTest {

    @Test
    public void testCheckWork() {

        final Work work = new Work();
        Assert.assertEquals("expected --->", 1, work.checkWork());
    }

}
