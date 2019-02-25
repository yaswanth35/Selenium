package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Invisibilityofelement {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.freecrm.com/index.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("username")).sendKeys("yaswanth35"+Keys.TAB+"test@123");
		
		//driver.findElement(By.xpath("//input[@value = 'Login']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver , 20);
		
	WebElement logbtn =	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value = 'Login']")));
		
	driver.navigate().refresh();
	
		logbtn.click();
		

	}

}
