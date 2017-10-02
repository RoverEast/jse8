package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import static one.two.three.four.five.StaticImport.*;

public class StaticImportTest {

    @Test
    public void testStatic() {
        
        final boolean secondStatic = isFirstfield();
        Assert.assertTrue("expectrd true", secondStatic);
        Assert.assertTrue("expectrd true", firstMeth());
        Assert.assertTrue("expectrd true", FIRSTFIELD);
    }

}