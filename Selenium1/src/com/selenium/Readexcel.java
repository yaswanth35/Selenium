package com.selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readexcel {
	
	static FileInputStream fis;
	
	static XSSFWorkbook wb;
	
  static  XSSFRow row;
    
   static XSSFCell cell;

	public static void main(String[] args) {
		
		try {
			 fis = new FileInputStream("C:\\Users\\YASWANTH.UPPARAPALLI\\Desktop\\yaswanth\\Credentials.xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
		      wb = new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		XSSFSheet sheet = wb.getSheet("sheet1");
		
	
		
	    int rowcount = sheet.getLastRowNum()+1;
	    
		
	    
	    System.out.println(rowcount);
	    
	
	    for(int i =1; i<rowcount; i++) {
	    	
	    	row = sheet.getRow(i);
	    	
	    	for(int j=0 ; j< row.getLastCellNum(); j++) {
	    		
	    		cell = row.getCell(j);
	    		String cellvalue = sheet.getRow(i).getCell(j).getStringCellValue();
	    		
	    		System.out.println(cellvalue);
	    		
	    		
	    	}
	    	
	       
		    
	    }
	    
	    System.out.println(row.getLastCellNum());

		
		
		
		

	}

}
