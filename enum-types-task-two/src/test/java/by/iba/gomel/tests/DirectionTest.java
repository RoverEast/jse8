package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.Direction;
import by.iba.gomel.Point;

public class DirectionTest {

    @Test
    public void testMove() {
        final Point point = new Point();
        Assert.assertEquals("expected --->", "Point [x=0, y=1]", Direction.UP.move(point));
        Assert.assertEquals("expected --->", "Point [x=1, y=1]", Direction.RIGHT.move(point));
        Assert.assertEquals("expected --->", "Point [x=1, y=0]", Direction.DOWN.move(point));
        Assert.assertEquals("expected --->", "Point [x=0, y=0]", Direction.LEFT.move(point));
    }

}
