package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.SmartTVSet;


public class SmartTVSetTest {

	@Test
	public void testNextChannel() {
		SmartTVSet TV = new SmartTVSet();
		Assert.assertEquals("method should return 1",1, TV.nextChannel());
	}

	@Test
	public void testPrevousChannel() {
		SmartTVSet TV = new SmartTVSet();
		Assert.assertEquals("method should return 1",1, TV.prevousChannel());
	}

}
