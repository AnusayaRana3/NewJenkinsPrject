package com.JenkinsPracticeTest;

import org.testng.annotations.Test;

public class DemoFetchDataFromJenkinsTest {
	
	public String browser;
	
	@Test
	public void PracticeDataFetch()
	{
		System.out.println("prcacticeDataFetch from jenkins");
		browser=System.getProperty("BROWSER");
		System.out.println("Browser Updated");
	}

}
