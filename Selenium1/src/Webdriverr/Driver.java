package Webdriverr;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Driver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
		
		driver.get("http://newtours.demoaut.com/");
		
	List<WebElement> linklist	= driver.findElements(By.tagName("a"));
	
	System.out.println(linklist.size());
	
	for(int i=0; i<linklist.size(); i++) {
		
		
	
		
		
		System.out.println(linklist.get(i).getText());
		
	}
	
	List<WebElement> Idlist	= driver.findElements(By.tagName("input"));
	
	System.out.println(Idlist.size());
	
	for(int i=0; i<Idlist.size(); i++) {
		
		
		System.out.println(Idlist.get(i).getText());
		
		
	}
	
	}
		
		
		// driver.findElement(By.linkText("REGISTER")).click();
		
	
	}


