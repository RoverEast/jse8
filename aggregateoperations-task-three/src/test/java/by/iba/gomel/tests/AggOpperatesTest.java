package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.Ao;

public class AggOpperatesTest {

    @Test
    public void testGetLargestPageNumber() {
        final Ao aggOpperates = new Ao();
        aggOpperates.initList(10);
        Assert.assertEquals("expected --->", "Book{numberOfPages=109, title='9', year=1999}",
                aggOpperates.getLargestPageNumber());
    }

    @Test
    public void testGetNumberOfBooks() {
        final Ao aggOpperates = new Ao();
        aggOpperates.initList(10);
        Assert.assertEquals("expected --->", 9, aggOpperates.getNumberOfBooks());
    }

    @Test
    public void testGetNumberOfSameTitle() {
        final Ao aggOpperates = new Ao();
        aggOpperates.initList(10);
        Assert.assertEquals("expected --->", 0, aggOpperates.getNumberOfSameTitle());
    }

}
