package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthenticationService;

import io.restassured.response.Response;

public class TC_Authentication_ID_03_ForgetPasswordTest {

	@Test(description="Verify the account forget password test is working")
	public void forgetPasswordAccount()
	{
		AuthenticationService authenticationService=new AuthenticationService();
		Response response=authenticationService.forgetPassword("xyz4@gmail.com");
		System.out.println(response.asPrettyString());
		Assert.assertEquals(response.getStatusCode(), 200);
	}
}
