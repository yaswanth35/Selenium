package Webdriverr;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Crmcontact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
		

		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
		
		driver.get("https://www.freecrm.com/index.html");
		
	//driver.findElement(By.name("username")).sendKeys("yaswanth35");
		
		DriverUtility ut = new DriverUtility(driver);
		
	
		
		ut.findelementbyname("username", "yaswanth35");
		
		driver.findElement(By.name("password")).sendKeys("test@123");
		
		driver.findElement(By.xpath("//input[@type = 'submit']")).submit();		
		driver.switchTo().frame("mainpanel");
		
	Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//a[@title = 'Contacts']"))).build().perform();
		driver.findElement(By.xpath("//a[@title = 'New Contact']")).click();
		
	   List<WebElement> lookup = driver.findElements(By.xpath("//td[@align ='left']/descendant::input[@value ='Lookup']"));
		
	   lookup.get(0).click();
	   
	 Set<String> handles = driver.getWindowHandles();
	 

	 
	 Iterator<String> it = handles.iterator();
	 
	 String handler1  = it.next();
	 
	 String handler2 = it.next();
	 
	 driver.switchTo().window(handler2);
	 
	 driver.findElement(By.name("search")).sendKeys("test");
	 
	 driver.findElement(By.xpath("//input[@value = 'Search']")).click();
	 
	 driver.findElement(By.linkText("test23")).click();
	 
	 driver.switchTo().window(handler2);
	 
	 driver.quit();
	 
	}

}
