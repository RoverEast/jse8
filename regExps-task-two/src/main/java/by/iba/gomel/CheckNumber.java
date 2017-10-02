package by.iba.gomel;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * class CheckNumber
 */
public class CheckNumber {

    /**
     * CheckNumber
     */
    public CheckNumber() {
        // empty
    }

    /**
     * checkNumber meth
     *
     * @param number
     *            car number
     * @return return result
     */
    public String checkNumber(final String number) {
        final Pattern p = Pattern.compile("\\d{4}\\s[ABEIKMHOPCTX]{2}-[0-7]");
        final Matcher m = p.matcher(number);
        if (m.matches()) {
            return "ok";
        }
        return "wrong number";
    }
}
