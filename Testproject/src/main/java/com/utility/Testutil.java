package com.utility;

import java.util.ArrayList;
import java.util.Arrays;

public class Testutil {
	
	protected static Xls_Reader reader;
	
	public static String sheetname;
	
	
	public static ArrayList<Object[]> getdatafromexcel() {
		try{
		reader = new Xls_Reader("C:\\Users\\YASWANTH.UPPARAPALLI\\Desktop\\testdata.xlsx");
		}
		
		catch(Exception e) {
			
			e.printStackTrace();
		}
		ArrayList<Object[]> mydata = new ArrayList<Object[]>();
		 sheetname = "Logintestdata";
		
		for(int rownum =2; rownum<=reader.getRowCount(sheetname); rownum++) {
			
			
			String Username = reader.getCellData(sheetname, "Username", rownum);
			String Password = reader.getCellData(sheetname, "Password", rownum);
			
			
			Object ob[] = {Username,Password};
			
		
			
			mydata.add(ob);
			
		}
		
	return mydata;	
		
		
	}



	
	
	
	
	
}
