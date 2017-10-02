package by.iba.gomel.tests;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import by.iba.gomel.SymbCounter;

public class SymbCounterTest {

    @Rule
    public final SystemOutRule log = new SystemOutRule().enableLog();

    @Test
    public void testSymbCounter() throws IOException {
        final SymbCounter symbCounter = new SymbCounter();
        Assert.assertEquals("expected --->", 0, symbCounter.symbCounter('a', "name.txte"));

    }

    @Test
    public void testSymbCounterTwo() throws IOException {
        final SymbCounter symbCounter = new SymbCounter();
        Assert.assertEquals("expected --->", 5, symbCounter.symbCounter('a', "name.txt"));

    }

}
