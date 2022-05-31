package com.JenkinsPracticeTest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoJenkinsScmPoolTest {

	@Test
	public void scmPoolTest()
	{
		
		System.out.println("Welcome to Jenkins");
		
		Reporter.log("Welcome to testng report");
		
		Reporter.log("Welcome to github report1");
		
		Reporter.log("Welcome to jenkins report");
	}
}
