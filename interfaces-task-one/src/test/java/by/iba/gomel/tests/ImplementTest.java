package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.Implement;

public class ImplementTest {

    @Test
    public void testImplement() {
        final Implement implement = new Implement();
        implement.setS("qweasdzxc");
        Assert.assertEquals("expected cxzdsaewq", "cxzdsaewq", implement.backWords());

    }

}
