package Webdriverr;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Popupshandle {
	
	public static void main(String[] args)  {
	WebDriver driver = new ChromeDriver();
	
	

	
	driver.get("http://jsbin.com/usidix/1");
	
	driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
	
	String alertMessage ="";
	
	alertMessage = driver.switchTo().alert().getText();
	
    driver.switchTo().alert().accept();
	
	System.out.println(alertMessage);
	
	if(alertMessage.contentEquals("This is an alert box.")) {
		
		System.out.println("Test Passed");
	}
		else {
			System.out.println("Test Failed");//*[@id="li_myaccount"]/a/b
	
	}
}
} 
// second way of handling alerts by import alert method from selenium//
	
    /*  Alert alert = driver.switchTo().alert();
      
    
      
      alert.accept();
      
      
      System.out.println(alert.getText());

      
	}
} */