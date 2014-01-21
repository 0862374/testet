package com.test.testproj;

import junit.framework.Assert;
import junit.framework.TestCase;

public class AppTest extends TestCase {

	public void testPrintHelloWorld() {

		Assert.assertEquals(App.getHelloWorld(), "Hello World!");

	}

}
