package by.iba.gomel;

import java.util.List;

/**
 * class TransformList
 */
public class TransformList {

    /**
     * TransformList constructor
     */
    public TransformList() {
        // empty
    }

    /**
     * tranformList meth
     *
     * @param ints
     *            input list
     * @return ret result
     */
    public final int tranformList(final List<Integer> ints) {
        return Integer.parseInt(ints.stream().filter(el -> el > 0).map(Object::toString).reduce("",
                String::concat));
    }
}
