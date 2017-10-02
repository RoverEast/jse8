package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.VarArray;

public class VarArrayTest {

    @Test
    public void testVarArr() {
        final VarArray varArray = new VarArray();
        final Object arr[] = new Object[] {1};
        Assert.assertEquals("expected --->", "[1]", varArray.varArr(arr));
    }

}
