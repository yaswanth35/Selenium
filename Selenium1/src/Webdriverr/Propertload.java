package Webdriverr;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class Propertload {

	static Properties prop = new Properties();
	static WebDriver driver;
	static FileInputStream fis;
	
	
	public static void main(String[] args)  {
		// TODO Auto-generated method stub

	
		
		
		
		try {
			fis = new FileInputStream("C:\\Users\\YASWANTH.UPPARAPALLI\\eclipse-workspace\\Selenium1\\src\\Webdriverr\\Chrome.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
        try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
        
       String Url= prop.getProperty("Url") ;
        
        System.out.println(Url);
     
      String browsername = prop.getProperty("Browsername");
      
      if (browsername.equals("Chrome")) {
    	  
    	  System.setProperty("WebDriver.chromedriver.driver" , "C:\\chromedriver.exe");
    	  
    	  driver = new ChromeDriver();
    	  
    	  
    	  
    	  

      
      
    
	  driver.get(Url);
	  
	  driver.findElement(By.xpath("//input[@name ='username']")).sendKeys(prop.getProperty("Username"));
      
		driver.findElement(By.xpath("//input[@name ='password']")).sendKeys(prop.getProperty("Password"));
      
      }

}
}

