package com.com.TestNG;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NewTest {
	
	public static WebDriver d;
	
	@DataProvider(name = "test")
	
	public Iterator<Object[]> testdata() {
		
		
		List<Object[]> data = new ArrayList<Object[]>();
		
		Object[] data1 = {"yaswanth" , "password"};
		
		Object[] data2 = {"yaswanth23" , "password23"};
		
		data.add(data1);
		
		data.add(data2);
		
		return data.iterator();
		
		//Object[][] testdata = {{"yaswanth@g.com" , "password"} , {"yaswanth23@g.com" , "password23"}};
		
		//return testdata;
		
		
	}
	
  @Test(dataProvider = "test")
  
  public void logintest(String usr , String pwd) {
	  
	  
	  
	  d.findElement(By.id("user_email")).sendKeys(usr);
	  d.findElement(By.id("user_password")).sendKeys(pwd);
	  
	  d.findElement(By.name("commit")).click();
	  
	
	  
	  
	 
	 }
		 
	 
	  
  
  @BeforeMethod
  public void beforeMethod() {
  d = new ChromeDriver();
	  
d.get("https://sso.teachable.com/secure/42299/users/sign_in?clean_login=true&reset_purchase_session=1");
  }	

  @AfterMethod
  public void afterMethod() {
	  
	  d.close();
  }

}
