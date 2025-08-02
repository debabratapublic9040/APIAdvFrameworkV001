package com.api.base;

import java.util.HashMap;

import com.api.model.request.LoginRequest;
import com.api.model.request.SignUpRequest;

import io.restassured.response.Response;

public class AuthenticationService extends BaseService{
	
	private static final String Base_PATH="/api/auth/";
	
	public Response login(LoginRequest payload)
	{
		return postRequest(payload,Base_PATH+"login");
	}
	public Response signup(SignUpRequest payload)
	{
		return postRequest(payload,Base_PATH+"signup");
	}
	public Response forgetPassword(String emailAddress)
	{
		HashMap<String,String> map=new HashMap<String,String>();
		map.put("email", emailAddress);
		return postRequest(map,Base_PATH+"forgot-password");
	}

}
