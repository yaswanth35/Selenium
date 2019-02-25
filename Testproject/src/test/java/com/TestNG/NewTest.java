package com.TestNG;

import org.testng.annotations.Test;

import junit.framework.TestListener;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import com.utility.*;



public class NewTest {
	

	
  @Test
  public void testmethod1() {
	  
	 Assert.assertTrue(false);
  }
  
  @Test
  public void testmethod2() {
	  
	 Assert.assertTrue(true);
  }
  @AfterMethod
  public void afterMethod(ITestResult testresult) {
	  
	  if(testresult.isSuccess()) {
		  
		  System.out.println("Test Passed" + testresult.getName());
	  }
	  
	  if(!testresult.isSuccess()) {
		  
		  System.out.println("test Failed" + testresult.getName());
	  }
	  
	  
	  
  }

}
