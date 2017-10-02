package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.Dog;

public class DogTest {

    @Test
    public void testGetNameSays() {
        Dog d1 = new Dog();
        Dog d2 = new Dog();
        d1.setName("spot");
        d2.setName("scruffy");
        d1.setSays("Ruff!");
        d2.setSays("Wurf!");
        Assert.assertEquals("expected spot", "spot", d1.getName());
        Assert.assertEquals("expected scruffy", "scruffy", d2.getName());
        Assert.assertEquals("expected Ruff!", "Ruff!", d1.getSays());
        Assert.assertEquals("expected Wurf!", "Wurf!", d2.getSays());
    }

    @Test
    public void testCompareNameSaysFirst() {
        Dog d1 = new Dog();
        Dog d2 = new Dog();
        d1.setName("spot");
        d2.setName("scruffy");
        d1.setSays("Ruff!");
        d2.setSays("Wurf!");
        Assert.assertFalse("expected false", d1.equals(d2));
        Assert.assertFalse("expected false", d1 == d2);

    }

    @Test
    public void testCompareNameSaysSecond() {
        Dog d1 = new Dog();
        Dog d2 = new Dog();
        Dog d3 = new Dog();
        d3 = d2;
        d1.setName("spot");
        d2.setName("scruffy");
        d1.setSays("Ruff!");
        d2.setSays("Wurf!");
        Assert.assertFalse("expected false", d1.equals(d3));
        Assert.assertFalse("expected false", d1 == d3);
        Assert.assertTrue("expected True", d2.equals(d3));
        Assert.assertTrue("expected True", d2 == d3);

    }

}
