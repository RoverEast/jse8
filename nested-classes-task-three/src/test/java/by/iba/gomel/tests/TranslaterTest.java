package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.BookOne;
import by.iba.gomel.BookOne.Page;
import by.iba.gomel.Translater;

public class TranslaterTest {

    @Test
    public void testPrint() {
        final BookOne book1 = new BookOne(10, "vol#1");
        book1.setPages();

        final Translater translaterEN = new Translater() {
            @Override
            public void translateTo(final Page page) {
                page.setContent(page.getContent().replaceFirst("RU", "EN"));
            }
        };

        Assert.assertEquals("expected --->", "Book{name='vol#1'}Page{pageNumber=2, content='RU 2'}",
                book1.getPageContent(book1, 2));
        Assert.assertEquals("expected --->", "Book{name='vol#1'}Page{pageNumber=2, content='EN 2'}",
                translaterEN.print(book1, 2));
        Assert.assertEquals("expected --->", "Page not found", book1.getPageContent(book1, 11));
        Assert.assertEquals("expected --->", "Page not found", translaterEN.print(book1, 11));
    }

}
