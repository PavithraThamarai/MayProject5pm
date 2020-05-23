package org.infos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Junit {

	@BeforeClass
	public static void browserLaunch() {
		System.out.println("open browser");
	}
	@AfterClass
	public static void closeBrowser()
	{
		System.out.println("close");
	}
	@Before
	public void startTime()
	{
		System.out.println("start");
	}
	@After
	public void endTime()
	{
		System.out.println("end");
	}
	@Test
	public void testCase() 
	{
		System.out.println("testcases");
	}
}
