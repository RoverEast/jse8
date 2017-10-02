package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.RoadBycicle;

public class RoadBycicleTest {

    @Test
    public void testGetCadence() {
        RoadBycicle roadBycicle = new RoadBycicle();
        Assert.assertEquals("method should return 0", 0, roadBycicle.getCadence());
    }

    @Test
    public void testGetSpeed() {
        RoadBycicle roadBycicle = new RoadBycicle();
        Assert.assertEquals("method should return 0", 0, roadBycicle.getSpeed());
    }

    @Test
    public void testGetGear() {
        RoadBycicle roadBycicle = new RoadBycicle();
        Assert.assertEquals("method should return 1", 1, roadBycicle.getGear());
    }

    @Test
    public void testAmort() {
        RoadBycicle roadBycicle = new RoadBycicle();
        Assert.assertEquals("method should return 0", 0, roadBycicle.getAmort());
    }

    @Test
    public void testSpeedUp() {
        RoadBycicle roadBycicle = new RoadBycicle();
        roadBycicle.speedUp(5);
        Assert.assertEquals("method should return 5", 5, roadBycicle.getSpeed());
    }

    @Test
    public void testAplyBreaks() {
        RoadBycicle roadBycicle = new RoadBycicle();
        roadBycicle.applyBrakes(0);
        Assert.assertEquals("method should return 0", 0, roadBycicle.getSpeed());
    }

    @Test
    public void testChangeGear() {
        RoadBycicle roadBycicle = new RoadBycicle();
        roadBycicle.changeGear(2);
        Assert.assertEquals("method should return 2", 2, roadBycicle.getGear());
    }
    
    @Test
    public void testChangeCadence() {
        RoadBycicle roadBycicle = new RoadBycicle();
        roadBycicle.changeCadence(2);
        Assert.assertEquals("method should return 2", 2, roadBycicle.getCadence());
    }


}
