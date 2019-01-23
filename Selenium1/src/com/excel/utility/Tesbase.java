package com.excel.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Tesbase {
	
	public static WebDriver driver;
	public static Properties Prop = null;
	static FileInputStream	fis = null;
	
	@SuppressWarnings("resource")
	
		
			public static void initialization() {
		
		//if(Browser.equalsIgnoreCase("chrome")) {
				
		
				
			driver = new ChromeDriver();
			
			driver.get("https://www.freecrm.com/index.html");
		//}
		//else if(Browser.equalsIgnoreCase("firefox")) {
			
		//	driver = new FirefoxDriver();
		//	driver.get("https://www.freecrm.com/index.html");
		//}
	}
		@BeforeMethod
		
		public void setup() {
			
			
			initialization();
			
			
		}
		
		@AfterMethod
		
		public void cleanup() {
			
			driver.close();
		}
				
}

