package by.iba.gomel;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * class CheckIsbn
 */
public class CheckIsbn {

    private static final String FIRST = "(978|979)([-\\s])([0-5]|6[01]\\d|62[01]|7|8\\d|9[0-4]|9[5-8]";
    private static final String SECOND = "\\d|99[2-8]\\d|999[0-7]\\d)\\2\\d{1,5}\\2\\d{1,5}\\2\\d";

    /**
     * constructor
     */
    public CheckIsbn() {
        // empty
    }

    /**
     * checkIsbn meth
     *
     * @param isbn
     *            isbn number
     * @return ret result
     */
    public String checkIsbn(final String isbn) {
        final Pattern p = Pattern.compile(CheckIsbn.FIRST + CheckIsbn.SECOND);
        final Matcher m = p.matcher(isbn);
        if (m.matches()) {
            return "ok";
        }
        return "wrong number";
    }

}
