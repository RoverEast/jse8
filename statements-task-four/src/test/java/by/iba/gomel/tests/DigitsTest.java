package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.Digits;

public class DigitsTest {

    @Test
    public void testGetArray() {
        Digits d = new Digits();
        Assert.assertEquals("expected 1",1, d.methTwo(13465));
        
    }

}
