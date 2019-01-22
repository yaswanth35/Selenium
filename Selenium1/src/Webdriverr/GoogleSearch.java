package Webdriverr;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("Java");
		
	     List<WebElement> list =  driver.findElements(By.xpath("//ul[@role = 'listbox']//li/descendant::div[@class = 'sbqs_c']"));
		
	     for (int i=0; i<list.size(); i++) {
	    	 
	    	 String s = list.get(i).getText();
	    	 System.out.println(s);
	     }
	     
	     
	}

}
