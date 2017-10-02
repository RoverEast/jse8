package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.ArPr;

public class ArPrTest {

    @Test
    public void testFullProgres() {
        ArPr a1 = new ArPr(1,1,10);
        Assert.assertEquals("expect 10","10", a1.showSize());
        Assert.assertEquals("expect 1","1", a1.showFirst());
        Assert.assertEquals("expect 10","10", a1.showLast());
        Assert.assertEquals("expect 1","1", a1.showStep());
        Assert.assertEquals("expect 55","55", a1.showSum());
    }
    
    @Test
    public void testEmptyProgres() {
        ArPr a2 = new ArPr();
        Assert.assertEquals("expect  no progression","no progression", a2.showSize());
        Assert.assertEquals("expect  no progression","no progression", a2.showFirst());
        Assert.assertEquals("expect  no progression","no progression", a2.showLast());
        Assert.assertEquals("expect  no progression","no progression", a2.showStep());
        Assert.assertEquals("expect  no progression","no progression", a2.showSum());
    }

}
