package com.selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ClassA {
	
	public static int x = 10;
	
	public static Properties prop = null;
	
	public static FileInputStream fis = null;
	
	public ClassA()  {
		
		try {
			fis = new FileInputStream(System.getProperty("user.dir")+"/obj.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			prop = new Properties();
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
