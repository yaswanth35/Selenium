package com.TestNG;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Hooks implements IRetryAnalyzer {

	static int counter = 0;
	
	static int retry = 5;
	
	@BeforeMethod
	
	public void before() {
		
		System.out.println("beforemethod");
	}
	
	@AfterMethod
	
	public void after() {
		
		System.out.println("aftermethod");
	}

	public boolean retry(ITestResult result) {
		
		if(!result.isSuccess() && counter<retry) {
			
			counter++;
			
			return true;
			
		}
		
		
		return false;
	
	}
	
	
}
