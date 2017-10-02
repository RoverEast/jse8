package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.AnimalCollect;

public class AnimalCollectTest {

    @Test
    public void testBinSearch() {
        final AnimalCollect animalCollect = new AnimalCollect();
        animalCollect.initCol();
        Assert.assertEquals("expected --->", "I can walk", animalCollect.binSearch(8));
    }

    @Test
    public void testDeleteByColor() {
        final AnimalCollect animalCollect = new AnimalCollect();
        animalCollect.initCol();
        animalCollect.deleteByColor("red");
        Assert.assertEquals("expected --->", "[I can swim, I can walk]",
                animalCollect.getCollect());
    }

    @Test
    public void testSortBySize() {
        final AnimalCollect animalCollect = new AnimalCollect();
        animalCollect.initCol();
        Assert.assertEquals("expected --->", "[I can fly, I can swim, I can walk]",
                animalCollect.getCollect());
        animalCollect.sortBySize();
        Assert.assertEquals("expected --->", "[I can walk, I can swim, I can fly]",
                animalCollect.getCollect());
    }

}
