package com.selenium;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSender;
import io.restassured.specification.RequestSpecification;

public class Apitest {

	static ExtentReports r;

	static ExtentTest test;

	public static void main(String[] args) {
		r = new ExtentReports(System.getProperty("user.dir") + "/reports.html");

		test = r.startTest("api testing");

		System.out.println(System.getProperty("user.dir"));

		RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";

		RequestSpecification httpRequest = RestAssured.given();

		test.log(LogStatus.PASS, "requesthasbeen placed");

		Response response = httpRequest.request(Method.GET, "/Hyderabad");

		test.log(LogStatus.PASS, "got the response");

		String responseBody = response.getBody().asString();

		System.out.println(response.getStatusLine());
		// System.out.println("Response Body is => " + responseBody);

		r.flush();

	}

}
