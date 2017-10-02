package by.iba.gomel.tests;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.TransformList;

public class TransformListTest {

    @Test
    public void testTranformList() {
        final TransformList transformList = new TransformList();
        final List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        ints.add(3);
        ints.add(4);
        ints.add(-1);
        Assert.assertEquals("expected --->", 1234, transformList.tranformList(ints));
    }

}
