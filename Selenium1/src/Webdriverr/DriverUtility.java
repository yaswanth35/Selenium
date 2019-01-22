package Webdriverr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DriverUtility {
	
	public static WebDriver driver;
	
	public DriverUtility(WebDriver x) {
		
		this.driver = x;
		
	}
	
	
	public void findelementbyname( String some, String sendkeys) {
		
		
		driver.findElement(By.name("some")).sendKeys("sendkeys");
		
		
	}

}
