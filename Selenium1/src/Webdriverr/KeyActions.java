package Webdriverr;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class KeyActions {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://learn.letskodeit.com/p/practice");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Login")).sendKeys(Keys.ENTER);
		
		//WebDriverWait wait = new WebDriverWait(driver, 20);
		
		//wait.until(ExpectedConditions.elementToBeSelected(driver.findElement(By.id("yah")))); //ExpectedConditions.presenceOfElementLocated(By.id("user_email"))).sendKeys("yaswanth"+Keys.TAB+"password"+Keys.RETURN);
		
		
		driver.findElement(By.id("user_email")).sendKeys("yaswanth"+Keys.TAB+"password"+Keys.RETURN);
		
		
		
		
		
		
		
		
		

	}

}
