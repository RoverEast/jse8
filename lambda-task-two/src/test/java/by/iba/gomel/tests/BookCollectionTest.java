package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.BookCollection;

public class BookCollectionTest {

    @Test
    public void testSortBooksByTitle() {
        final BookCollection bookCollection = new BookCollection();
        bookCollection.addBooks();
        bookCollection.sortBookByTitle(bookCollection.getBookCol());
        Assert.assertEquals("expected --->",
                "[Book [numberOfPages=5, title=a, year=1999], Book [numberOfPages=4, title=b, year=1998], Book [numberOfPages=6, title=c, year=2001]]",
                bookCollection.getbookCollection());
    }

    @Test
    public void testSortBooksByYear() {
        final BookCollection bookCollection = new BookCollection();
        bookCollection.addBooks();
        bookCollection.sortBookByYear(bookCollection.getBookCol());
        Assert.assertEquals("expected --->",
                "[Book [numberOfPages=6, title=c, year=2001], Book [numberOfPages=5, title=a, year=1999], Book [numberOfPages=4, title=b, year=1998]]",
                bookCollection.getbookCollection());
    }

}
