package com.utility;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;

public class Jsonreader {
	
	static FileReader filereader;
	
	static FileInputStream fis;
	
	static Gson gson;
	
	static String path = System.getProperty("user.dir")+"/customerdetails.json";
	
	 List<Customer> customerslist;
	
	static BufferedReader bufferReader = null;
	
	public static List<Customer> getcustomerdata() {
		
	try {
		filereader = new FileReader(path);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
//	try {
//		fis = new FileInputStream(file);
//	} catch (FileNotFoundException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	
	bufferReader = new BufferedReader(filereader);
	
	gson = new Gson();
	
	Customer[] customers = gson.fromJson(bufferReader, Customer[].class);
		
	return Arrays.asList(customers);
	
	
		
	}
	
	public static void main(String[]arg) {
		
	List<Customer> c	= Jsonreader.getcustomerdata();
		
	for(Customer x : c) {
		
		
		String firstname = x.getname();
		
		String pwd = x.getpassword();
		
		System.out.println(firstname);
		System.out.println(pwd);
	}
	
	
	
	

	
	
	}

}
