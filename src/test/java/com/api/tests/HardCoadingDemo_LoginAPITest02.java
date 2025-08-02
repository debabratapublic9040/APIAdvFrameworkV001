package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

@Listeners(com.api.listeners.TestListener.class)
public class HardCoadingDemo_LoginAPITest02 {
	
	@Test(description="Verify if login api test is working")
	public void loginTest()
	{
		RestAssured.baseURI="http://64.227.160.186:8080";
		RequestSpecification x=RestAssured.given();
		RequestSpecification y=x.header("Content-Type","application/json");
		RequestSpecification z=y.body("{\"username\": \"swift1234\",\"password\": \"swift1234$\"}");
		Response response=z.post("/api/auth/login");
		System.out.println(response.asPrettyString());
		Assert.assertEquals(response.getStatusCode(), 200);
		
	}

}
