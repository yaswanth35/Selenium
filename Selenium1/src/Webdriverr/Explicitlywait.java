package Webdriverr;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Explicitlywait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		
		driver.get("https://www.freecrm.com/index.html");
		
		
		
		driver.findElement(By.linkText("Customers")).click();
		
		
		//Clickon(driver,driver.findElement(By.linkText("Sign Up")),20);
		
		
		Moveto(driver , driver.findElement(By.linkText("Login")));
		
		
		
	}



//public static void Clickon(WebDriver driver, WebElement locator, int timeout) {
	
	//new WebDriverWait(driver, timeout).ignoring(WebDriverException.class).
	//until(ExpectedConditions.elementToBeClickable(locator)).click();


public static void Moveto(WebDriver driver, WebElement locator) {
	
	
Actions action = new Actions(driver);

action.moveToElement(locator).build().perform();
action.click();
}
}
