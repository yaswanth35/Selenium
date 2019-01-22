package Webdriverr;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;



public class Takescreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
		
		//Back and forward simulation to //switch to some external URL in case of navigate to method
		
		driver.get("https://www.incometaxindiaefiling.gov.in/home");
		//Convert web driver object to TakeScreenshot
		 TakesScreenshot scrShot =((TakesScreenshot) driver);
		 
		 //Call getScreenshotAs method to create image file
		
		 File src = scrShot.getScreenshotAs(OutputType.FILE);
		 //Move image file to new destination
		 
	        File DestFile=new File("C:\\google2.png");
	        
	      //Copy file at destination
	        
	        FileUtils.copyFile(src, DestFile);
	        try {
	            WebDriverWait wait = new WebDriverWait(driver, 2);
	            wait.until(ExpectedConditions.alertIsPresent());
	            Alert alert = driver.switchTo().alert();
	            System.out.println(alert.getText());
	            alert.accept();
	        
	        } catch (Exception e) {
	            //exception handling
	        }
	        
	}
}