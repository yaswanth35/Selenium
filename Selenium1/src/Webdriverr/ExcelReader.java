package Webdriverr;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		File src = new File("C:\\Users\\YASWANTH.UPPARAPALLI\\eclipse-workspace\\Selenium1\\Testdata\\testdata.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		
	   XSSFWorkbook wb = new XSSFWorkbook(fis);
	   
	   XSSFSheet sheet = wb.getSheetAt(0);
	   
	   XSSFRow row = sheet.getRow(0);
	   
	   XSSFCell celldata = row.getCell(1);
	   
	  System.out.println(celldata.getStringCellValue());
		
		
	}

	
	
	
}
