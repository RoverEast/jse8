package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.Finder;

public class FinderTest {

    @Test
    public void testFindWords() {
        final Finder finder = new Finder("Wealth is not his that has it, but his who enjoys it.",
                "history");
        Assert.assertEquals("expected --->", "is his ", finder.findWords());
    }

}
