package com.TestNG;

import org.testng.annotations.Test;

import com.sun.xml.internal.ws.policy.spi.AssertionCreationException;

public class Testng extends Hooks {
	
	
	
	@Test
	
	public void test1() {
		
		System.out.println("testmethod1");
	}
	
	@Test
	
	public void test2() {
		
		System.out.println("testmethod2");
	}
	
	@Test(retryAnalyzer = Hooks.class)
public void test3() {
		
	int[] i = {1,2};
		
		System.out.println(i[2]);
		
		System.out.println("testmethod3");
	}

}
