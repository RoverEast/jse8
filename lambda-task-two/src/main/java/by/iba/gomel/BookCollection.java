package by.iba.gomel;

import java.util.ArrayList;
import java.util.List;

/**
 * BookCollection class
 */
public class BookCollection {

    private static final int FOUR = 4;
    private static final int FIVE = 5;
    private static final int SIX = 6;
    private static final int FIRST = 1998;
    private static final int SECOND = 1999;
    private static final int THIRD = 2001;
    private final List<Book> bookCol = new ArrayList<>(5);
    private final SortBooks sortBooksByYear = s -> Bc.sortByYear(this.bookCol);

    private final SortBooks sortBooksByTitle = s -> Bc.sortByTitle(this.bookCol);

    /**
     * constructor
     */
    public BookCollection() {
        // empty
    }

    /**
     * addBooks meth
     */
    public final void addBooks() {
        this.bookCol.add(new Book(BookCollection.FIVE, "a", BookCollection.SECOND));
        this.bookCol.add(new Book(BookCollection.SIX, "c", BookCollection.THIRD));
        this.bookCol.add(new Book(BookCollection.FOUR, "b", BookCollection.FIRST));
    }

    /**
     * getBookCol meth
     *
     * @return collection BookCol
     */
    public final List<Book> getBookCol() {
        return this.bookCol;
    }

    /**
     * getbookCol
     *
     * @return string collection
     */
    public final String getbookCollection() {
        return this.bookCol.toString();
    }

    /**
     * sortBookByTitle meth
     *
     * @param bookCol
     *            collection val
     */
    public final void sortBookByTitle(final List<Book> bookCol) {
        this.sortBooksByTitle.sort(bookCol);
    }

    /**
     * sortBooksByYear meth
     *
     * @param bookCol
     *            collection val
     */
    public final void sortBookByYear(final List<Book> bookCol) {
        this.sortBooksByYear.sort(bookCol);
    }

}
