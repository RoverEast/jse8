package by.iba.gomel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * BookTwo class
 */
public class BookTwo {
    private static final Logger LOGGER = LoggerFactory.getLogger(BookTwo.class);
    private static final int HUND = 100;
    // a bookmark
    private static final int CURRENTPAGENUMBER = 0;
    private final int bookSize;
    private final Pages[] pages = new Pages[BookTwo.HUND];

    /**
     * constructor
     *
     * @param bookSize
     *            book size
     * @param name
     *            book name
     */
    public BookTwo(final int bookSize) {
        this.bookSize = bookSize;
    }

    /**
     * Comment
     *
     * @param com
     *            comment
     * @param pageNumber
     *            page number
     */
    public final void comment(final String com, final int pageNumber) {
        class Bookmark {
            private final String comm;
            private final int pageNumb;

            public Bookmark(final int pageNumber, final String comment) {
                this.comm = comment;
                this.pageNumb = pageNumber;
            }

            public String getCom() {
                if ((this.pageNumb <= BookTwo.this.bookSize) && (this.pageNumb > 0)) {
                    if (BookTwo.this.pages[this.pageNumb - 1].comment != null) {
                        return BookTwo.this.pages[this.pageNumb - 1].toString()
                                + BookTwo.this.pages[this.pageNumb - 1].comment;
                    }
                    return BookTwo.this.pages[this.pageNumb - 1].toString() + "no comment";
                } else {
                    return "Page not found";
                }
            }

            /**
             * set Comment
             */
            public void setCom() {
                if ((this.pageNumb <= BookTwo.this.bookSize) && (this.pageNumb > 0)) {
                    BookTwo.this.pages[this.pageNumb - 1].comment = this.comm;
                }
            }
        }
        final Bookmark comment = new Bookmark(pageNumber, com);
        comment.setCom();
        BookTwo.LOGGER.info(comment.getCom());

    }

    public final int getCurrentPgeNumber() {
        return BookTwo.CURRENTPAGENUMBER;
    }

    /**
     * getPage
     *
     * @param pageNumber
     *            pageNumber
     * @return page
     */
    public final Pages getPage(final int pageNumber) {
        if ((pageNumber <= this.bookSize) && (pageNumber > 0)) {
            return this.pages[pageNumber - 1];
        }
        return null;
    }

    /**
     * get page content
     *
     * @param book
     *            book
     * @param pageNumber
     *            page number
     * @return info
     */
    public final String getPageConten(final BookTwo book, final int pageNumber) {
        if ((pageNumber <= this.bookSize) && (pageNumber > 0)) {
            return this.toString() + book.pages[pageNumber - 1].toString();
        }
        return "Page not found";
    }

    /**
     * set book pages
     */
    public final void setPags() {
        for (int i = 0; i < this.bookSize; i++) {
            final String content = "RU " + Integer.toString(i + 1);
            this.pages[i] = new Pages(i + 1, content);
        }
    }

    /**
     * class page
     */
    public static class Pages {
        private final int pageNumber;
        private final String content;
        private String comment;

        /**
         * constructor
         *
         * @param pageNumber
         *            pageNumber
         * @param content
         *            content
         */
        public Pages(final int pageNumber, final String content) {
            this.pageNumber = pageNumber;
            this.content = content;
        }

        @Override
        public final String toString() {
            return "Page{" + "pageNumber=" + this.pageNumber + ", content='" + this.content + '\''
                    + '}';
        }
    }
}
