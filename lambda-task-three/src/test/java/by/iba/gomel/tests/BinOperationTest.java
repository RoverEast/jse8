package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.BinOperation;

public class BinOperationTest {

    @Test
    public void testBinOp() {
        final BinOperation binOperation = new BinOperation();
        Assert.assertEquals("expected --->", 9, binOperation.binOp(3, 2));
    }

}
