package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.Rhombus;
import by.iba.gomel.ShapeController;
import by.iba.gomel.Square;

public class ShapesTest {

    @Test
    public void testCalculateArea() {

        final ShapeController sc = new ShapeController();
        final Rhombus r = new Rhombus();
        final Square s = new Square();
        r.hashCode();
        r.equals(r);
        s.hashCode();
        s.equals(s);
        sc.initArray();
        sc.hashCode();
        sc.equals(sc);
        Assert.assertEquals("expected 0", 0, sc.calculateArea());
        sc.initArray(3);
        Assert.assertEquals("expected 64", 64, sc.calculateArea());
    }

}
