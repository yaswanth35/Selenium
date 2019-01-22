package com.com.TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Accenture {
	
	public static void main(String[]args) {
		
		WebDriver d = new ChromeDriver();
		
		
		
		d.get("https://m.methodology-test.accenture.com/ai/Home/AI?url=/publish.ai/disciplines/AI%20Value%20Conceptualization_D4DE0A40.html");
		
		//d.findElement(arg0);
		
		//d.findElement(arg0);
		  
		 List<WebElement> list = d.findElements(By.xpath("//div[@id = 'newUI_Relationships']//li/a"));
		 
		 for(int i=1 ; i< list.size() ; i++) {
			 
			 
			 String x = d.findElement(By.xpath("//div[@id = 'newUI_Relationships']//li[i]/a")).getText();
			 
			 System.out.println(x);
		
	
	}

}
}
