package by.iba.gomel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * class FindMax
 */
public class FindMax {

    /**
     * FindMax constructor
     */
    public FindMax() {
        // empty
    }

    /**
     * findMax meth
     *
     * @param str
     *            input list
     * @return ret result
     */
    public final String findMax(final List<String> str) {
        final List<String> numbs = new ArrayList<>();
        final Pattern p = Pattern.compile("\\d+");
        for (int i = 0; i < str.size(); i++) {
            final String number = str.get(i);
            final Matcher matcher = p.matcher(number);
            while (matcher.find()) {
                numbs.add(matcher.group());
            }
        }
        final String m = String.valueOf(numbs.stream().max(String::compareTo).orElse("0"));
        return Arrays.toString(str.stream().filter(s -> s.contains(m)).toArray());
    }

}
