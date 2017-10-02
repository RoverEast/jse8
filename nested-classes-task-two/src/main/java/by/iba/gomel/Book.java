package by.iba.gomel;

/**
 * book class
 */
public class Book {
    private static final int HUND = 100;
    // a bookmark
    private static final int CURRENTPAGENUMBER = 0;
    private final int bookSize;
    private final Page[] pages = new Page[Book.HUND];
    private final String name;

    /**
     * constructor
     *
     * @param bookSize
     *            book size
     * @param name
     *            book name
     */
    public Book(final int bookSize, final String name) {
        this.bookSize = bookSize;
        this.name = name;
    }

    public final int getCurrentPageNumber() {
        return Book.CURRENTPAGENUMBER;
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
    public final String getPageContent(final Book book, final int pageNumber) {
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
            final String content = Integer.toString(i + 1);
            this.pages[i] = new Page(i + 1, content);
        }
    }

    @Override
    public final String toString() {
        return "Book{" + "name='" + this.name + '\'' + '}';
    }

    /**
     * class content
     */
    public static final class Contents {

        public static final int LINK = 1;

        private Contents() {
            // empty
        }

        /**
         * navigate
         *
         * @param book
         *            book
         * @param pageNumber
         *            page number
         * @return info
         */
        public static String navigate(final Book book, final int pageNumber) {
            return book.pages[pageNumber - 1].toString();
        }
    }

    private static class Page {
        private final int pageNumber;
        private final String content;

        public Page(final int pageNumber, final String content) {
            this.pageNumber = pageNumber;
            this.content = content;
        }

        @Override
        public String toString() {
            return "Page{" + "pageNumber=" + this.pageNumber + ", content='" + this.content + '\''
                    + '}';
        }
    }
}
