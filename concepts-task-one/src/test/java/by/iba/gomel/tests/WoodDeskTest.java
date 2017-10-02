package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.WoodDesk;

public class WoodDeskTest {

	@Test
	public void testGetWeight() {
		WoodDesk wd = new WoodDesk();
		Assert.assertEquals("method should return 10",10, wd.getWeight());
	}

	@Test
	public void testGetHeight() {
		WoodDesk wd = new WoodDesk();
		Assert.assertEquals("method should return 30",30, wd.getHeight());
	}

}
