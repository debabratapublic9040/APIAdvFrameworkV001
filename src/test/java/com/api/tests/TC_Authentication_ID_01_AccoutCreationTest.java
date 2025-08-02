package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthenticationService;
import com.api.model.request.SignUpRequest;

import io.restassured.response.Response;

public class TC_Authentication_ID_01_AccoutCreationTest {
	@Test(description="Verify the account creation test")
	public void createAccoutTest()
	{
		
//		//With below code we are creating user by the help of Pojo class Design Pattern
//		SignUpRequest signUpRequest= new SignUpRequest("Demo2", "Demo1234$", "xyz2@gmail.com","Demo3" , "Demo4","1234567890");
//		AuthenticationService authenticationService=new AuthenticationService();
//		Response response = authenticationService.signup(signUpRequest);
//		Assert.assertEquals(response.asPrettyString(),"User registered successfully!");
		
		//Here we are using Builder design pattern to pass the data for the post request
		SignUpRequest signUpRequest=new SignUpRequest.Builder()
		.email("xyz4@gmail.com")
		.firstName("Demo4")
		.lastName("Demo4")
		.mobileNumber("1234567890")
		.password("Demo1234$")
		.username("Demo4")
		.builder();
		
		AuthenticationService authenticationService=new AuthenticationService();
		Response response=authenticationService.signup(signUpRequest);
		Assert.assertEquals(response.asPrettyString(),"User registered successfully!");
		Assert.assertEquals(response.getStatusCode(),200);
		
		
	}

}
