package com.TestNG;

import java.sql.Driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.utility.*;

public class FreeCrm {
	
	
	WebDriver driver;
	
	ChromeOptions options;
	
	
	@BeforeMethod
	
	public void Launchapp() {
	
		
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
		options = new ChromeOptions();
		
		options.setHeadless(true);
		driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("https://www.freecrm.com/index.html");
	}
	
	@Test(groups = {"smoketest"})
	
	public void logintest() {
		
		WebElement username = driver.findElement(By.name("username"));
		WebElement password = driver.findElement(By.name("password"));

		
		username.clear();
		username.sendKeys("yaswanth");
		
		password.clear();
		password.sendKeys("test");
		//String path = System.setProperty("desktop", "C:\\Users\\YASWANTH.UPPARAPALLI\\Desktop");
		//Takessscreenshot.Takess1creenshot( path+"/vinay3.png", driver);
		
		
	}
	
	
	
	
@AfterMethod
	
	public void logout() {
		
		driver.close();
	}
	
	
	

}
