package by.iba.gomel;

import by.iba.gomel.BookOne.Page;

/**
 * Translater class
 */
public class Translater implements Translatable {

    @Override
    public final String print(final BookOne book, final int pageNumber) {
        final Page page = book.getPage(pageNumber);
        if (page != null) {
            this.translateTo(page);
            return book.toString() + page.toString();
        }
        return "Page not found";
    }

    /**
     * This implementation ...
     *
     * @return nothing.
     */
    @Override
    public void translateTo(final Page page) {
        page.setContent(page.getContent().replaceFirst("RU ", "BY"));
    }

}
