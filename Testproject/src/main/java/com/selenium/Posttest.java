package com.selenium;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.testng.annotations.Test;

import com.google.gson.JsonObject;
public class Posttest {

	public static void main(String[] args) {
		
		
//@Test

//public void testmethod() {
    JsonObject requestparams = new JsonObject();
    
    requestparams.addProperty("FirstName", "Virender"); 
    requestparams.addProperty("LastName", "Singh");
     
    requestparams.addProperty("UserName", "simpleuser001");
    requestparams.addProperty("Password", "password1");
    requestparams.addProperty("Email",  "someuser@gmail.com");
		
    System.out.println("test");

    RestAssured.baseURI = "http://restapi.demoqa.com/customer";
    
    RequestSpecification request = RestAssured.given();
    
    request.header("Content-Type", "application/json");
    
    request.body(requestparams.getAsJsonArray().toString());
    
    Response response = request.post("/register");
    
    System.out.println(response.getStatusCode());
    System.out.println("test");
	}

}

