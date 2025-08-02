package com.api.tests;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class HardCoadingDemo_LoginAPITest3 {
	
	@Test(description="Verify if login api test is working")
	public void loginTest()
	{
		
		given()
		.header("Content-Type","application/json")
		.body("{\"username\": \"swift1234\",\"password\": \"swift1234$\"}")
		
		.when()
		.post("http://64.227.160.186:8080/api/auth/login")
		
		.then()
		.statusCode(200);

	}

}
