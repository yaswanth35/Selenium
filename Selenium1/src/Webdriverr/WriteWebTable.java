package Webdriverr;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.utility.Xls_Reader;

public class WriteWebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		// /html/body/div[6]/div[1]/div[1]/div[3]/div/table/tbody/tr[1]/th[1]
	  //  /html/body/div[6]/div[1]/div[1]/div[3]/div/table/tbody/tr[2]/td[1]
		
		String before_xpath_company = "//*[@id='customers']/tbody/tr[";
		
		String after_xpath_company = "]/td[1]";
		
String before_xpath_contact = "//*[@id='customers']/tbody/tr[";
		
		String after_xpath_contact = "]/td[2]";
		
	List<WebElement> rownum =	driver.findElements(By.xpath("//*[@id='customers']//tr"));
	
	System.out.println(rownum.size());
	
	Xls_Reader reader = new Xls_Reader("C:\\Users\\YASWANTH.UPPARAPALLI\\eclipse-workspace\\Selenium1\\Testdata\\testdata.xlsx");
	
	String sheetname = "Testdata";
	
	for (int i=2; i<=rownum.size(); i++) {
		
		String Actual_Xpath = before_xpath_company+i+after_xpath_company;
		
		String companyname = driver.findElement(By.xpath(Actual_Xpath)).getText();
		
		System.out.println(companyname);
		
	reader.setCellData(sheetname, "companyname", i, companyname);
		
		String Actual_Xpath_contact = before_xpath_contact+i+after_xpath_contact;
		
		String contactname = driver.findElement(By.xpath(Actual_Xpath_contact)).getText();
		System.out.println(contactname);
		
		reader.setCellData(sheetname, "contact", i, contactname);
	}
		
		
	}

}
