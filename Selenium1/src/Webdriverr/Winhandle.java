package Webdriverr;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Winhandle {


	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.incometaxindiaefiling.gov.in/home");
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.findElement(By.name("UserName")).sendKeys("yaswanth.upparapalli");
		//driver.findElement(By.name("Password")).sendKeys("Saibaba@2013");
		
		//driver.findElement(By.id("submitButton")).click();
		
		//new WebDriverWait(driver , 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class = 'btn btn-Agree']")));
		
		//driver.findElement(By.xpath("//button[@class = 'btn btn-Agree']")).click();
		

		
		try {
			Robot rb = new Robot();
			
			rb.keyPress(KeyEvent.VK_TAB);
			rb.keyRelease(KeyEvent.VK_TAB);
			rb.keyPress(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	//new WebDriverWait(firefoxDriver, pageLoadTimeout).until(
       // webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
		
		Set<String> Handles =   driver.getWindowHandles();
		
		
	            Iterator<String> it =    Handles.iterator();
	            
	          String handle1 =  it.next();
	          
	          String handle2 =  it.next();
		
		System.out.println(driver.switchTo().window(handle1).getTitle());
		
		System.out.println(driver.switchTo().window(handle2).getTitle());
		
		
	}

}
