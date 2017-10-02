package by.iba.gomel;

/**
 * book class
 */
public class BookOne {
    private static final int HUND = 100;
    // a bookmark
    private static final int CURRENTPAGENUMBER = 0;
    private final int bookSize;
    private final Page[] pages = new Page[BookOne.HUND];
    private final String name;

    /**
     * constructor
     *
     * @param bookSize
     *            book size
     * @param name
     *            book name
     */
    public BookOne(final int bookSize, final String name) {
        this.bookSize = bookSize;
        this.name = name;
    }

    public final int getCurrentPgeNumber() {
        return BookOne.CURRENTPAGENUMBER;
    }

    /**
     * getPage
     *
     * @param pageNumber
     *            pageNumber
     * @return page
     */
    public final Page getPage(final int pageNumber) {
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
    public final String getPageContent(final BookOne book, final int pageNumber) {
        if ((pageNumber <= this.bookSize) && (pageNumber > 0)) {
            return this.toString() + book.pages[pageNumber - 1].toString();
        }
        return "Page not found";
    }

    /**
     * set book pages
     */
    public final void setPages() {
        for (int i = 0; i < this.bookSize; i++) {
            final String content = "RU " + Integer.toString(i + 1);
            this.pages[i] = new Page(i + 1, content);
        }
    }

    @Override
    public final String toString() {
        return "Book{" + "name='" + this.name + '\'' + '}';
    }

    /**
     * class page
     */
    public static class Page {
        private final int pageNumber;
        private String content;

        /**
         * constructor
         *
         * @param pageNumber
         *            pageNumber
         * @param content
         *            content
         */
        public Page(final int pageNumber, final String content) {
            this.pageNumber = pageNumber;
            this.content = content;
        }

        public final String getContent() {
            return this.content;
        }

        public final void setContent(final String content) {
            this.content = content;
        }

        @Override
        public final String toString() {
            return "Page{" + "pageNumber=" + this.pageNumber + ", content='" + this.content + '\''
                    + '}';
        }
    }
}
