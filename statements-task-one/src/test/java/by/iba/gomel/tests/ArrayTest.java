package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.Array;


public class ArrayTest {

    @Test
    public void testChekRow() {
        Array ar = new Array();
        ar.initArFirst();
        Assert.assertTrue("expected true",ar.chekRow(0));
        ar.initArSecond();
        Assert.assertFalse("expected false", ar.chekRow(0));
    }

    @Test
    public void testCheckColumn() {
        Array ar = new Array();
        ar.initArFirst();
        Assert.assertTrue("expected true",ar.checkColumnResult(0));
        ar.initArSecond();
        Assert.assertFalse("expected false", ar.checkColumnResult(0));
    }

    @Test
    public void testCheckDiag() {
        Array ar = new Array();
        ar.initArFirst();
        Assert.assertTrue("expected true",ar.checkDiag());
        ar.initArSecond();
        Assert.assertFalse("expected false", ar.checkDiag());
    }

}
