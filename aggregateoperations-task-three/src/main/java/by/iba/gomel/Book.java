package by.iba.gomel;

/**
 * class Book
 */
class Book {

    private final int numberOfPages;
    private final String title;
    private final int year;

    /**
     * Book constructor
     * 
     * @param numberOfPages
     *            number Of Pages
     * @param title
     *            Book title
     * @param year
     *            Book year
     */
    public Book(final int numberOfPages, final String title, final int year) {
        this.numberOfPages = numberOfPages;
        this.title = title;
        this.year = year;
    }

    /**
     * getNumberOfPages meth
     * 
     * @return number Of Pages
     */
    public int a() {
        return this.numberOfPages;
    }

    /**
     * getTitle meth
     * 
     * @return Book title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * getYear meth
     * 
     * @return Book year
     */
    public int b() {
        return this.year;
    }

    @Override
    public String toString() {
        return "Book{" + "numberOfPages=" + this.numberOfPages + ", title='" + this.title + '\''
                + ", year=" + this.year + '}';
    }
}
