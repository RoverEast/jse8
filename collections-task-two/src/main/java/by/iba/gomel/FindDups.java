package by.iba.gomel;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * class FindDups
 */
public class FindDups {

    /**
     * findDups constructor
     */
    public FindDups() {
        // empty
    }

    /**
     * findDups meth
     *
     * @param args
     *            input arr
     * @return ret string
     */
    public final String findDups(final String[] args) {
        final SortedSet<String> s = new TreeSet<>(String::compareToIgnoreCase);
        Collections.addAll(s, args);
        return s.size() + " distinct words: " + s;
    }
}
