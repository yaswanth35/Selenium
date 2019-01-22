package Webdriverr;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Navigations {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
		
		//Back and forward simulation to //switch to some external URL in case of navigate to method
		
		driver.get("https://www.google.com");
		
		driver.navigate().to("https://www.freecrm.com/index.html");
		
		driver.navigate().back();
		
	 Thread.sleep(2000);
	 
	 driver.navigate().forward();
	 
	 Thread.sleep(2000);
	 
	 driver.navigate().back();
		
		
	}

}
