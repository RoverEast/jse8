package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.FastDog;



public class FastDogTest {

	@Test
	public void testSpeed() {
		FastDog fastDog = new FastDog();
		Assert.assertEquals("method should return 20",20, fastDog.speed());
	}

	@Test
	public void testGetWeight() {
		FastDog fastDog = new FastDog();
		Assert.assertEquals("method should return 15",15, fastDog.getWeight());
	}

}
