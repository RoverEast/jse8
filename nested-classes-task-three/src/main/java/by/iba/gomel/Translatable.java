package by.iba.gomel;

import by.iba.gomel.BookOne.Page;

/**
 * Translatable interface
 */
public interface Translatable {
    /**
     * print method
     *
     * @param book
     *            book
     * @param pageNumber
     *            page number
     * @return info
     */
    String print(BookOne book, int pageNumber);

    /**
     * translate
     *
     * @param page
     *            page
     */
    void translateTo(Page page);

}
