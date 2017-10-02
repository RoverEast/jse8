package by.iba.gomel.tests;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.CollectionCopy;

public class CollectionCopyTest {

    @Test
    public void testCopy() {
        final Collection<Integer> collection = new ArrayList<>();
        CollectionCopy.getCollectionCopy();
        collection.add(1);
        collection.add(2);
        collection.add(3);
        final Collection<Number> collection1 = new ArrayList<>();
        CollectionCopy.copy(collection, collection1);
        Assert.assertEquals("expected --->", "[1, 2, 3]", collection1.toString());
    }

}
