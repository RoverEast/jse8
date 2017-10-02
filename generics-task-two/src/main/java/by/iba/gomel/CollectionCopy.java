package by.iba.gomel;

import java.util.Collection;
import java.util.Collections;

/**
 * class CollCopy
 */
public final class CollectionCopy {

    /**
     * CollCopy constructor
     */
    private CollectionCopy() {
        // empty
    }

    /**
     * copy meth
     *
     * @param copyFrom
     *            copy from
     * @param copyTo
     *            copy to
     */
    public static void copy(final Collection<? extends Number> copyFrom,
            final Collection<Number> copyTo) {
        Collections.addAll(copyTo, copyFrom.toArray(new Number[copyFrom.size()]));
    }

    public static CollectionCopy getCollectionCopy() {
        return new CollectionCopy();
    }
}
