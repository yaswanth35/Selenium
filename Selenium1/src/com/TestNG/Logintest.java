package com.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.excel.utility.Tesbase;
import com.excel.utility.Testlistener;

import org.testng.Assert;


@Listeners(Testlistener.class)
public class Logintest extends Tesbase  {
	
	

	//@BeforeMethod
	
	//public void Launchapp() {
	
	//initialization();
		
	//}

	@Test(priority=3, groups = "smoketest" , enabled = false)
	
	public void logintest() {
		WebElement username = driver.findElement(By.name("username"));
		WebElement password = driver.findElement(By.name("password"));
		WebElement loginbtn = driver.findElement(By.xpath("//input[@type = 'submit']"));
		
		username.sendKeys("naveenk");
		
		password.sendKeys("test@123");
		
		loginbtn.findElement(By.xpath("//input[@type = 'submit']")).submit();	
		
	}	
	
	@Test(priority=2,groups = {"smoketest", "Regrssion"}, dependsOnMethods =("Urltest"),enabled = false )
	
	public void logintest2() {
		WebElement username = driver.findElement(By.name("username"));
		Flash(username , driver);
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement password = driver.findElement(By.name("password"));
		WebElement loginbtn = driver.findElement(By.xpath("//input[@type = 'submit']"));
		username.sendKeys("yaswanth");
		password.sendKeys("test@123");
		loginbtn.submit();
	
		
	}
	
	@Test(priority=1 , retryAnalyzer = Testlistener.class ,enabled = true )
	
	public void Urltest() {
		
	String s =	driver.getTitle();
	try {
	Assert.assertEquals("#1 Free software in the cloud for sales and service", s);
	}
	
	catch(java.lang.AssertionError t) {
	
	org.testng.Assert.fail("expected and actual result do not match"); 
	}
	}
		
	//@AfterMethod
	
	//public void logout() {
		
		//driver.close();
		
		
	//}

	public static void Flash(WebElement element, WebDriver driver) {
		
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		for(int i=0; i<50; i++) {
			js.executeScript("arguments[0].setAttribute('style','border: solid 2px white');", element);
		}
		
}	
	}
		


