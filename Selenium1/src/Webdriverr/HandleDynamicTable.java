package Webdriverr;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDynamicTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
        driver.get("https://www.freecrm.com/index.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.findElement(By.name("username")).sendKeys("naveenk");
		
		driver.findElement(By.name("password")).sendKeys("test@123");
		
		driver.findElement(By.xpath("//input[@type = 'submit']")).submit();	
		
		driver.switchTo().frame("mainpanel");
		
		driver.findElement(By.linkText("CONTACTS")).click();
		
		List<WebElement> name = driver.findElements(By.xpath("//a[@context = 'contact']"));
		
		System.out.println(name.size());
		
		
	
	

	
	for(int i=1; i<=28; i++) {
		Select page = new Select(driver.findElement(By.xpath("//div[@class ='pagination']/select[1]")));
		page.selectByIndex(i);
		
		System.out.println(name.get(i).getText());
		
		Thread.sleep(2000);
		
		
	}

	
		
		
		}
		
	
		
		
		
	}

