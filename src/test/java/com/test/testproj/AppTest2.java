package com.test.testproj;

import junit.framework.Assert;
import junit.framework.TestCase;

public class AppTest2 extends TestCase {
	public void testPrintHelloNetherlands() {

		Assert.assertEquals(App.getHelloNetherlands(), "Hello Netherlands!");

	}
}
