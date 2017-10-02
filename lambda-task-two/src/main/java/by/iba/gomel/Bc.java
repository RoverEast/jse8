package by.iba.gomel;

import java.util.List;

/**
 * BookComparator class
 */
public final class Bc {

    private Bc() {
        // empty
    }

    /**
     * sortByTitle meth
     *
     * @param bookCol
     *            list val
     */
    public static void sortByTitle(final List<Book> bookCol) {
        bookCol.sort((final Book o1, final Book o2) -> o1.getTitle().compareTo(o2.getTitle()));
    }

    /**
     * sortByYear meth
     *
     * @param bookCol
     *            list val
     */
    public static void sortByYear(final List<Book> bookCol) {
        bookCol.sort((final Book o1, final Book o2) -> o2.getYear().compareTo(o1.getYear()));

    }
}
