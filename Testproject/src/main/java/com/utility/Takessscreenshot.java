package com.utility;

import org.openqa.selenium.WebDriver;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Takessscreenshot {
	
	//public static TakesScreenshot t;
	
	
	public static void Takess1creenshot(String path , WebDriver driver) {
		
		
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest = new File(path);
		
		
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
	
	
	
	
	
	

}
