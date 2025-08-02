package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthenticationService;
import com.api.model.reponse.LoginResponse;
import com.api.model.request.LoginRequest;

import io.restassured.response.Response;

public class TC_Authentication_ID_02_LoginAPITest {
	
	@Test(description="Verify if login api is working")
	public void loginTest()
	{
		LoginRequest loginRequest=new LoginRequest("swift1234","swift1234$");
		AuthenticationService authService=new AuthenticationService();
		Response response=authService.login(loginRequest);
		System.out.println(response.asPrettyString());
		Assert.assertEquals(response.getStatusCode(), 200);
		
		//Serialization is happening automatically if Jackson libraries are there in pom.xml file
		//De-serialization is happening by the help of as() if Jackson libraries are there in pom.xml file
		
		LoginResponse loginResponse = response.as(LoginResponse.class);
		System.out.println("Gmail: "+loginResponse.getEmail());
		System.out.println("Username: "+loginResponse.getUsername());
		System.out.println("ID: "+loginResponse.getId());
		
		Assert.assertTrue(loginResponse.getToken()!=null);
		Assert.assertEquals(loginResponse.getEmail(), "debabratar018@gmail.com");
		Assert.assertEquals(loginResponse.getUsername(), "swift1234");
		Assert.assertEquals(loginResponse.getId(), 2114);
		
	}

}
