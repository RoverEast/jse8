package by.iba.gomel.tests;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import by.iba.gomel.ListOfNumbers;

public class ListOfNumbersTest {

    @Rule
    public final SystemOutRule log = new SystemOutRule().enableLog();

    @Test
    public void testWriteListOne() throws IOException {
        final ListOfNumbers listOfNumbers = new ListOfNumbers();
        final String s = "OutFile.txt";
        listOfNumbers.writeList("rw");
        listOfNumbers.readList(s);
        Assert.assertEquals("expected --->", "9", listOfNumbers.getAl());
    }

    @Test
    public void testWriteListThree() {
        final ListOfNumbers listOfNumbers = new ListOfNumbers();
        listOfNumbers.writeList("rw");
        Assert.assertEquals("expected --->",
                "Entering try statement writeList\nClosing PrintWriter\n", this.log.getLog());
    }

    @Test
    public void testWriteListTwo() {
        final ListOfNumbers listOfNumbers = new ListOfNumbers();
        listOfNumbers.writeList("r");
        Assert.assertEquals("expected --->", "8", listOfNumbers.getAl());
    }
}
