package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthenticationService;
import com.api.base.UserProfileManagementService;
import com.api.model.reponse.LoginResponse;
import com.api.model.reponse.UserProfileGetResponse;
import com.api.model.request.LoginRequest;

import io.restassured.response.Response;

public class TC_UserManagement_ID_01_GetUserProfileRequestTest {
	
	@Test(description="Verify the get user api test")
	public void getUserProfileRequest()
	{
		
		AuthenticationService authenticationService=new AuthenticationService();
		Response response=authenticationService.login(new LoginRequest("swift1234","swift1234$"));
		LoginResponse loginResponse=response.as(LoginResponse.class);
		System.out.println(loginResponse.getToken());
		
		UserProfileManagementService userProfileManagementService=new UserProfileManagementService();
		response=userProfileManagementService.getProfile(loginResponse.getToken());
		System.out.println(response.asPrettyString());
		
		UserProfileGetResponse userProfileGetResponse = response.as(UserProfileGetResponse.class);
		
		Assert.assertEquals(userProfileGetResponse.getEmail(),"debabratar018@gmail.com");
		Assert.assertEquals(userProfileGetResponse.getFirstName(),"Debabrata");
		Assert.assertEquals(userProfileGetResponse.getLastName(),"Rout");
		Assert.assertEquals(userProfileGetResponse.getmobileNumber(),"9040999484");
		Assert.assertEquals(userProfileGetResponse.getUsername(),"swift1234");
		Assert.assertEquals(userProfileGetResponse.getId(),2114);
	}

}
