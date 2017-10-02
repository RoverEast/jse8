package by.iba.gomel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * digits class
 */
public class Digits {

    /**
     * Logger.
     * 
     * For future reference - comments on purpose of specific field should go here.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(Digits.class);
    private static String[]     even   = {"0", "2", "4", "6", "8"};

    /**
     * empty constructor
     */
    public Digits() {
        // empty
    }

    /**
     * return true or false
     * 
     * @param c
     *            input digit
     * @return true digit even
     */
    public final boolean methOne(String c) {
        final String numb = "" + c;
        boolean l = false;
        for (int j = 0; j < even.length; j++) {
            if (numb.startsWith(even[j])) {
                l = true;
                break;
            } else {
                l = false;
            }
        }
        return l;

    }

    /**
     * print number without even digits
     * 
     * @param a
     *            input number
     * @return 1
     */
    public final int methTwo(int a) {
        final String s = Integer.toString(a);
        final char[] charNumb = s.toCharArray();
        for (int i = 0; i < charNumb.length; i++) {
            String numb = Character.toString(charNumb[i]);
            if (this.methOne(numb) && charNumb.length > 1) {
                numb = "";
                Digits.LOGGER.info(numb);
            } else if (this.methOne(numb) && charNumb.length == 1) {
                numb = "0";
                Digits.LOGGER.info(numb);
            } else if (!(this.methOne(numb)) && charNumb.length >= 1) {
                Digits.LOGGER.info(numb);
            }
        }
        return 1;
    }

}
