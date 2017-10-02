package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import by.iba.gomel.BookTwo;

public class BookTest {

    @Rule
    public final SystemOutRule log = new SystemOutRule().enableLog();

    @Test
    public void testComment() {
        final BookTwo book1 = new BookTwo(10);
        book1.setPags();
        book1.comment(null, 3);
        Assert.assertEquals("expected--->", "Page{pageNumber=3, content='RU 3'}no comment",
                this.log.getLog());
    }

    @Test
    public void testCommentThree() {
        final BookTwo book1 = new BookTwo(10);
        book1.setPags();
        book1.comment("comment", 0);
        Assert.assertEquals("expected--->", "Page not found", this.log.getLog());
    }

    @Test
    public void testCommentTwo() {
        final BookTwo book1 = new BookTwo(10);
        book1.setPags();
        book1.comment("comment", 3);
        Assert.assertEquals("expected--->", "Page{pageNumber=3, content='RU 3'}comment",
                this.log.getLog());
    }

}
