package Webdriverr;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLreader {
	
	public static XSSFWorkbook workbook = null;
	
	public static XSSFSheet sheet = null;
	
	private static   XSSFRow row = null;
	   
	private static XSSFCell cell = null;
	   
	 File src = null;
	   
	private static FileInputStream fis = null;

	public XLreader(String path) throws Exception {
		
		src = new File(path);
		
		fis = new FileInputStream(src);
		
		workbook = new XSSFWorkbook(fis);
		
		sheet = workbook.getSheetAt(0);
		
		row = sheet.getRow(0);
		
		cell = row.getCell(0);
		
}



}
		
		
		
		
		
		
		
		
		
		
		
		

	
	

