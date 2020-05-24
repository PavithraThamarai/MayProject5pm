package org.infos;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG {

	@BeforeClass
	private  void browserLaunch() {
		System.out.println("open browser");
	}
	@AfterClass
	private  void closeBrowser()
	{
		System.out.println("close");
	}
	@BeforeMethod
	private void startTime()
	{
		System.out.println("start");
	}
	@AfterMethod
	private void endTime()
	{
		System.out.println("end");
	}
	@Test
	private void testCase() 
	{
		System.out.println("testcases");
		System.out.println("done");
	}
	
}
