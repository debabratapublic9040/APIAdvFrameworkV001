package com.api.tests;

import org.testng.annotations.Test;

import com.api.base.AuthenticationService;
import com.api.base.UserProfileManagementService;
import com.api.model.reponse.LoginResponse;
import com.api.model.request.LoginRequest;
import com.api.model.request.ProfileUpdateRequest;

import io.restassured.response.Response;

public class TC_UserManagement_ID_02_UpdateProfileTest {
	
	@Test(description="Verify the profile update test")
	public void updateProfileTest()
	{
		AuthenticationService authenticationService=new AuthenticationService();
		Response reponse1=authenticationService.login(new LoginRequest("swift1234","swift1234$"));
		LoginResponse loginResponse=reponse1.as(LoginResponse.class);
		String token=loginResponse.getToken();
		System.out.println(reponse1.asPrettyString());
		System.out.println("**********************************************************************");
		
		UserProfileManagementService userProfileManagementService=new UserProfileManagementService();
		Response response2=userProfileManagementService.getProfile(loginResponse.getToken());
		System.out.println(response2.asPrettyString());
		System.out.println("**********************************************************************");
		
		ProfileUpdateRequest profileUpdateRequest = new ProfileUpdateRequest.Builder()
				.email("debabratar018@gmail.com")
				.firstName("swift12345")
				.lastName("swift12345")
				.mobileNumber("9040999444").build();
		Response response3=userProfileManagementService.updateProfile(token, profileUpdateRequest);
		System.out.println(response3.asPrettyString());
	}

}
