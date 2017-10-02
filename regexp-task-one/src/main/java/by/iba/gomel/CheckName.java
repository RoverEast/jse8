package by.iba.gomel;

import java.util.regex.Pattern;

/**
 * class CheckName
 */
public class CheckName {

    private static final int TWO = 2;

    /**
     * constructor
     */
    public CheckName() {
        // empty
    }

    /**
     * checkName meth
     *
     * @param fullName
     *            input name
     * @return check result
     */
    public final String checkName(final String fullName) {
        final Pattern p = Pattern.compile("\\s");
        final String[] words = p.split(fullName);
        if ((words.length != CheckName.TWO) || (words[0].length() != words[1].length())) {
            return "not ok";
        }
        return "ok";

    }

}
