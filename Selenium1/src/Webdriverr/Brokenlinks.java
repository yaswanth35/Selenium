package Webdriverr;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.pagefactory.ByAll;

public class Brokenlinks {

	public static void main(String[] args) throws Exception, Exception {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(1000, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.freecrm.com/index.html");
		
        driver.findElement(By.name("username")).sendKeys("naveenk");
		
		driver.findElement(By.name("password")).sendKeys("test@123");
		
		driver.findElement(By.xpath("//input[@type = 'submit']")).submit();	
		
		driver.switchTo().frame("mainpanel");
        
		List<WebElement>  links =driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		links.addAll(driver.findElements(By.tagName("img")));
		
		System.out.println(links.size());
		
		
		List<WebElement>  activelinks = new ArrayList<WebElement>();
		
		for(int i=0; i<=links.size(); i++) {
			
			if(links.get(i).getAttribute("href") != null) {
				
				activelinks.add(links.get(i));
				
				
			}
			
			
		}
		
		System.out.println(activelinks.size());
		
		
		for(int j=0; j<=activelinks.size(); j++) {
			
			
			URLConnection url = new URL(activelinks.get(j).getAttribute("href")).openConnection();
			
			
			HttpURLConnection connection =  (HttpURLConnection) url;
			
			String response = connection.getResponseMessage();
			
			connection.disconnect();
			
			System.out.println(activelinks.get(j).getAttribute("href") +"----->"+response);
			
			driver.findElement(new ByAll ((By.id("name")),(By.xpath("adad")))).getText();
			
		}
		
		
		
	}
}
