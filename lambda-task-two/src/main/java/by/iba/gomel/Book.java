package by.iba.gomel;

/**
 * Book class
 */
public class Book {
    private final int numberOfPages;
    private final String title;
    private final int year;

    /**
     * Book constructor
     *
     * @param numberOfPages
     *            numberOfPages val
     * @param title
     *            title val
     * @param year
     *            year val
     */
    public Book(final int numberOfPages, final String title, final int year) {
        this.numberOfPages = numberOfPages;
        this.title = title;
        this.year = year;
    }

    /**
     * getNumberOfPages meth
     *
     * @return numberOfPages val
     */
    public final int getNumberOfPages() {
        return this.numberOfPages;
    }

    /**
     * getTitle meth
     *
     * @return title val
     */
    public final String getTitle() {
        return this.title;
    }

    /**
     * getYear meth
     *
     * @return year val
     */
    public final Integer getYear() {
        return this.year;
    }

    /**
     * toString meth
     */
    @Override
    public final String toString() {
        return "Book [numberOfPages=" + this.numberOfPages + ", title=" + this.title + ", year="
                + this.year + "]";
    }

}
