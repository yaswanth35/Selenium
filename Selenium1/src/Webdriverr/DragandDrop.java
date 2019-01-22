package Webdriverr;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		
driver.get("https://jqueryui.com/droppable/");

//driver.switchTo().frame(0);

//Actions action = new Actions(driver);

//action.clickAndHold(driver.findElement(By.id("draggable"))).moveToElement(driver.findElement(By.id("droppable"))).release().perform();

int size = driver.findElements(By.tagName("iframe")).size();

System.out.println(size);

driver.switchTo().defaultContent();

try {
for(int i=0; i<=size; i++) {
	
	
	driver.switchTo().frame(i);
	

	
	int total = driver.findElements((By.id("draggable"))).size();
	
	System.out.println(total);
	
	driver.switchTo().defaultContent();
}
}

catch(Exception e) {
	
	System.out.println(e);
	e.printStackTrace();
}


Actions action = new Actions(driver);


driver.findElement(By.linkText("Slider")).click();

driver.switchTo().frame(0);
//div[@id = 'slider']/span

//WebDriverWait w = new WebDriverWait(driver , 10);

//WebElement e = driver.findElement(By.xpath("//div[@id = 'slider']/span"));

//w.until(ExpectedConditions.visibilityOf(e));



action.dragAndDropBy(driver.findElement(By.xpath("//div[@id = 'slider']/span")), 50, 0).perform();

	}

}
