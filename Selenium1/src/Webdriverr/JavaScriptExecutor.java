package Webdriverr;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;


public class JavaScriptExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();

driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);

driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);

driver.get("https://www.phptravels.net/");

WebElement element = driver.findElement(By.xpath("//input[@class = 'form-control input-lg dpd1']"));

String dateval = "10/10/2011";

SelectdatebyJS(element,dateval,driver);


WebElement element2 = driver.findElement(By.xpath("//input[@class = 'form-control input-lg dpd2']"));

String dateval1 = "10/10/2018";
SelectdatebyJS(element2,dateval1,driver);
	}

	public static void SelectdatebyJS(WebElement element, String dateval ,WebDriver driver) {
	
	JavascriptExecutor js = ((JavascriptExecutor) driver);
	
	js.executeScript("arguments[0].setAttribute('value', '"+dateval+"');", element);
}
	
	public static void Flash(WebElement element, WebDriver driver) {
		
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		
		js.executeScript("arguments[0].setAttribute('style','border: solid 2px white');", element);
		
		
		
		
		
	}
	
	
	
}
