package by.iba.gomel;

import java.util.List;
import java.util.stream.Collectors;

/**
 * class TrimList
 */
public class TrimList {

    /**
     * TrimList constructor
     */
    public TrimList() {
        // empty
    }

    /**
     * trimList meth
     *
     * @param list
     *            input list
     * @return trim list
     */
    public List<String> trimList(final List<String> list) {
        return list.stream().map(String::trim).collect(Collectors.toList());
    }
}
