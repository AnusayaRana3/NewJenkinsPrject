package com.JenkinsPracticeTest;

import org.testng.annotations.Test;

public class DemoJenkinsParameterTest {

	public String browser;
	public String url;
	
	@Test
	public void practice1Test()
	{
		System.out.println("TestNgPractice1Test-->Test1");
		browser=System.getProperty("Browser");
	}
	
	@Test
	public void practice2Test()
	{
		System.out.println("TestNgPractice1Test-->Test2");
		url=System.getProperty("URL");
	}
	
	@Test
	public void practice3Test()
	 {
		System.out.println("TestNgPractice1Test-->Test3");
		
	 }
	
	@Test
	public void practice4Test()
	 {
		System.out.println("TestNgPractice1Test-->Test4");
	 }
	
	@Test
	public void practice5Test()
	 {
		System.out.println("TestNgPractice1Test-->Test5");
	 }
}
