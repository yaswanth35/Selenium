package Webdriverr;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultiSelect {

	public static void main(String[] args) {
		
		
		
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://learn.letskodeit.com/p/practice");
	
	driver.manage().window().maximize();
	
	driver.manage().deleteAllCookies();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	Select s = new Select(driver.findElement(By.id("carselect")));
	
	s.selectByVisibleText("Benz");
	
	System.out.println("test passed");
	
	Select d = new Select(driver.findElement(By.id("multiple-select-example")));
	
	
	
	
	if(d.isMultiple()) {
		
		d.selectByVisibleText("Apple");
		
		d.selectByVisibleText("Orange");
		
		driver.findElement(By.id("multiple-select-example")).isDisplayed();
	}
	
	driver.findElement(By.id("opentab")).click();
	
	String handle = driver.getWindowHandle();
	
	ArrayList<String> Tabs = new ArrayList<String>(driver.getWindowHandles());
	
	driver.switchTo().window(Tabs.get(1));
	
	WebDriverWait wait = new WebDriverWait(driver,20);
	
	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("Login"))));
	
	driver.findElement(By.linkText("Login")).click();
	
	
	
	driver.switchTo().window(handle);
	
	driver.findElement(By.id("opentab")).click();

	}

}
