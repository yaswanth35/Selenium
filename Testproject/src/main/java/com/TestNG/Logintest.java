package com.TestNG;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.utility.Testutil;

import org.testng.Assert;

public class Logintest extends Testutil {
	
	WebDriver driver;
	
	
	
	
	
	
	@Parameters("browser")
	@BeforeMethod
	
	public void Launchapp(String browser) {
	
		if(browser.equalsIgnoreCase("chrome")) {
		driver = new ChromeDriver();
		}
		else {
			
			if(browser.equalsIgnoreCase("firefox")) {
				
				driver = new FirefoxDriver();
			}
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("https://www.freecrm.com/index.html");
	}	

@DataProvider

public Iterator<Object[]> getTestData() {
	
	//will fetch the data from xcel file using apache poi to do that we need to create a package or class
	
	ArrayList<Object[]> testdata = Testutil.getdatafromexcel();
	
	return testdata.iterator();
	
	
}



	@Test(dataProvider = "getTestData")
	
	public void logintest(String Username, String Password) {
		
		WebElement username = driver.findElement(By.name("username"));
		WebElement password = driver.findElement(By.name("password"));

		
		
		username.sendKeys(Username);
		
		
		password.sendKeys(Password);
		
		
		
		reader.setCellData(sheetname, "status", 2, "Passed");
		
		
		
		
		
	}
		
	@AfterMethod
	
	public void logout() {
		
		reader.setCellData(sheetname, "status", 2, "Passed");
	}
	
}	

