package com.api.tests;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class HardCoadingDemo_LoginAPITest01 {
	
	@Test(description="Verify if login api is working")
	public void loginTest()
	{
		//RestAssured.baseURI="http://64.227.160.186:8080";//made the RestAssured import as static so no need to declare RestAssured class to get methods.
		baseURI="http://64.227.160.186:8080";
		//Response response=RestAssured.given().header("Content-Type","application/json").body("{\"username\": \"swift1234\",\"password\": \"swift1234$\"}").post("/api/auth/login");
		Response response=given()
				.header("Content-Type","application/json")
				.body("{\"username\": \"swift1234\",\"password\": \"swift1234$\"}")
				.post("/api/auth/login");
		System.out.println(response.asPrettyString());
		Assert.assertEquals(response.getStatusCode(), 200);
		
	}

}
