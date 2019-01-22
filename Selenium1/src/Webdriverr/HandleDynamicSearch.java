package Webdriverr;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleDynamicSearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.phptravels.net/");
		
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.id("s2id_autogen8"))).build().perform();
		
		action.click().sendKeys("aus").build().perform();
		
	List<WebElement> drop =	driver.findElements(By.xpath("//li[@class ='select2-results-dept-0 select2-result select2-result-unselectable select2-result-with-children']//li/descendant::div[@class = 'select2-result-label']"));
		
	int j =	drop.size();
	
	System.out.println(j);
	
	for(int i=0; i<=j ; i++) {
		
		System.out.println(drop.get(i).getText());
		
		if(drop.get(i).getText().contains("Brazil")) {
			
			drop.get(i).click();
			
			break;
		}
		
	}
		
	
	}

	public static void Enter (WebDriver driver) {
	Keyboard keyboard = ((HasInputDevices) driver).getKeyboard();
	keyboard.pressKey(Keys.ENTER );
	
}
}