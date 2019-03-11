package edu.zut.cs.software.demo;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class DemoManagerTest extends TestCase {
	public DemoManagerTest(String testName) {
		super(testName);
	}
	public static Test suite() {
		return new TestSuite(DemoManagerTest.class);
	}
	public void testDemoManager()
	{
		assertTrue(true);
	}

}
