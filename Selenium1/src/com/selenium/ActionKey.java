package com.selenium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionKey {
	


	public static void main(String[] args) {
/*		
WebDriver driver = new ChromeDriver();
		
driver.manage().window().maximize();

driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

driver.get("https://jqueryui.com/droppable");

Actions action = new Actions(driver);

action.keyDown(Keys.COMMAND).sendKeys("a").keyDown(Keys.COMMAND).build().perform();

*/

		Object[] obj1 = {"yaswanth", "test"};
		Object[] obj2 = {"naveen", "test"};
		
		ArrayList<Object[]> data = new ArrayList<Object[]>();
		
		data.add(obj1);
		
		data.add(obj2);
		
		Iterator<Object[]> list =    data.iterator();
		
		
		
		System.out.println(list);
		
		ArrayList<ArrayList<String>> x = new ArrayList<ArrayList<String>>();
		
		
		
		
		
	}

}
