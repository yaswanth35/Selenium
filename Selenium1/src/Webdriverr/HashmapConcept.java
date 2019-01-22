package Webdriverr;

import java.awt.Image;
import java.awt.image.RenderedImage;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.natives.OCR;

import com.sun.jna.platform.unix.X11.XClientMessageEvent.Data;

public class HashmapConcept {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashmapConcept h = new HashmapConcept();
		
		System.out.println(HashmapConcept.datamap().get("firstname"));
		
		System.out.println(HashmapConcept.datamap().get("lastname"));
		
		String last = (String) HashmapConcept.datamap().get("lastname");
		
		String[] name1 = last.split("_");
		
		String x = name1[0];
		
		
		System.out.println(x);
		
		System.out.println(Array().size());
		
		for(int i=0; i<Array().size(); i++) 
		System.out.println(Array().get(i));
		
		


		 
		
	}

	
 
@SuppressWarnings("rawtypes")
public static HashMap  datamap() {
	
	
	HashMap<String, String> data = new HashMap<String, String>();
	
	data.put("firstname", "yaswanth");
	
	data.put("lastname", "Reddy_Upparapalli");
	
	return data;
	
	
}
	
	public static ArrayList Array() {
		
		ArrayList x = new ArrayList();
		
		x.add("yawanth");
		x.add("root");
		
		x.add(2);
		
		return x;
		

		
		
	}
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
