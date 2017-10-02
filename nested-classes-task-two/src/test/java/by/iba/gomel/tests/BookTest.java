package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.Book;

public class BookTest {

    @Test
    public void testBook() {
        final Book book1 = new Book(10, "vol#1");
        book1.setPages();
        Assert.assertEquals("expected --->", "Page not found", book1.getPageContent(book1, 11));
        Assert.assertEquals("expected --->", "Book{name='vol#1'}Page{pageNumber=2, content='2'}",
                book1.getPageContent(book1, 2));
        Assert.assertEquals("expected --->", "Page not found",
                book1.getPageContent(book1, book1.getCurrentPageNumber()));
        Assert.assertEquals("expected --->", "Page{pageNumber=3, content='3'}",
                Book.Contents.navigate(book1, 3));
        Assert.assertEquals("expected --->", "Page{pageNumber=1, content='1'}",
                Book.Contents.navigate(book1, Book.Contents.LINK));

        final Book book2 = new Book(10, "vol#2");
        book2.setPages();
        Assert.assertEquals("expected --->", "Page not found", book2.getPageContent(book2, 11));
        Assert.assertEquals("expected --->", "Book{name='vol#2'}Page{pageNumber=2, content='2'}",
                book2.getPageContent(book2, 2));
        Assert.assertEquals("expected --->", "Page not found",
                book2.getPageContent(book2, book2.getCurrentPageNumber()));
        Assert.assertEquals("expected --->", "Page{pageNumber=3, content='3'}",
                Book.Contents.navigate(book2, 3));
        Assert.assertEquals("expected --->", "Page{pageNumber=1, content='1'}",
                Book.Contents.navigate(book2, Book.Contents.LINK));
    }

}
