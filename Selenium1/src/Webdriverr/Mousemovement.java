package Webdriverr;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class Mousemovement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
		
		driver.get("https://www.freecrm.com/index.html");
		
		driver.findElement(By.name("username")).sendKeys("yaswanth35");
		
		driver.findElement(By.name("password")).sendKeys("test@123");
		
		driver.findElement(By.xpath("//input[@type = 'submit']")).submit();		
		driver.switchTo().frame("mainpanel");
		
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//a[@title = 'Contacts']"))).build().perform();
		
		driver.findElement(By.linkText("Combined Form")).click();
		
		driver.findElement(By.id("company_name")).sendKeys("test23");
		driver.findElement(By.id("first_name")).sendKeys("Rahul");
		driver.findElement(By.id("surname")).sendKeys("surname");
		
		Select select = new Select(driver.findElement(By.name("contact_category")));
		
		select.selectByVisibleText("Friend");
		
		Select select1 = new Select(driver.findElement(By.name("contact_status")));
		
		select1.selectByVisibleText("Active");
		
		driver.findElement(By.xpath("//input[@type = 'radio' and @name = 'allows_call' and @ value = 'N']")).click();
		
	
		
		driver.findElement(By.xpath("//input[@value ='Save' and @type = 'submit']")).submit();
		
		driver.findElements(By.xpath("//input[@value ='Save' and @type = 'submit']"));
	}

}
