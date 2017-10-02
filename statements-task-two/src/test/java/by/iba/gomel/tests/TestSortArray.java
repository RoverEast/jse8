package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.SortArray;

public class TestSortArray {

    @Test
    public void testGetElement() {
        SortArray s = new SortArray();
        s.arrInit();
        s.sortArr();
        Assert.assertEquals("expected 9",9, s.getElement(0));
    }

}
