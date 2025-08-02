package com.api.base;

import com.api.model.request.ProfileUpdateRequest;

import io.restassured.response.Response;

public class UserProfileManagementService extends BaseService{
	
	private static final String Base_Path="/api/users/";
	
	public Response getProfile(String token)
	{
		setAuthToken(token);
		return getRequest(Base_Path+"profile");
	}
	
	public Response updateProfile(String token, ProfileUpdateRequest payload)
	{
		setAuthToken(token);
		return putRequest(payload, Base_Path+"profile");
	}

}
