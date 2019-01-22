package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.excel.utility.EventHandler;

public class WebDriverevents {

	public static void main(String[] args) {
		
		WebDriver d = new ChromeDriver();
		
		EventFiringWebDriver driver = new EventFiringWebDriver(d);
		
		EventHandler eh = new EventHandler();
		
		driver.register(eh);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com");
		//name="btnK"
		
		driver.findElement(By.name("q")).sendKeys("java");
		
		driver.findElement(By.name("btnK")).click();
		

	}

}
