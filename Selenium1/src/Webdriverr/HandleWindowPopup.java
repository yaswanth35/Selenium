package Webdriverr;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class HandleWindowPopup {

	public static void main(String[] args) throws InterruptedException {
		
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);	
		
		driver.get("http://www.popuptest.com");
		
		driver.findElement(By.xpath("html/body/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[1]/font[3]/b/a")).click();
		
		 Set<String>    handler          =   driver.getWindowHandles();
		 
		 Iterator<String> it = handler.iterator();
		 
		String handler1  = it.next();
		
		System.out.println("parent window is" + handler1);
		
		Thread.sleep(2000);
		
		String handler2  = it.next();
		
		System.out.println("child window is" + handler2);
		
		Thread.sleep(2000);
		
		String childtitle = driver.switchTo().window(handler2).getTitle();
		
	   System.out.println(childtitle);
	   
	  driver.close();

	}

}
