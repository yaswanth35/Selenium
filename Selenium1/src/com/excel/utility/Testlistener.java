package com.excel.utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;
import org.testng.IRetryAnalyzer;
import com.TestNG.Logintest;

public class Testlistener extends Tesbase  implements ITestListener,IRetryAnalyzer {
	
	
	int counter = 0;
	
	int retrylimit =3;
	

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(result.getName() + "has started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		TakesScreenshot scr = ((TakesScreenshot)Tesbase.driver);
		
		String methodname = result.getName();
		 Calendar calendar = Calendar.getInstance();
	     SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		
		File src = scr.getScreenshotAs(OutputType.FILE);
		
		
				
				
				
		File Dest = new File("C:\\Users\\YASWANTH.UPPARAPALLI\\Desktop\\Blue Prism1\\"+methodname+"_"+formater.format(calendar.getTime())+".png");
		
		try {
			FileUtils.copyFile(src, Dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
		
		System.out.println("test failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean retry(ITestResult result) {
		
		if(counter < retrylimit) {
			
			counter ++;
			
			return true;
			
			
			
			
		}
		
		
		return false;
	}
	
	

	
	
	
	
}
