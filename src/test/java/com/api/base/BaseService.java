package com.api.base;

import static io.restassured.RestAssured.given;

import com.api.filters.LoggingFilter;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseService {
	
	//Base URi
	//Creating the request
	//Handing the request
	
	private static final String BASE_URL="http://64.227.160.186:8080";
	private RequestSpecification requestSpecification;
	
	static{
		RestAssured.filters(new LoggingFilter());
		}
	
	public BaseService()
	{
		//requestSpecification=RestAssured.given().baseUri(BASE_URL);//Below line we are using instead of this line
		requestSpecification=given().baseUri(BASE_URL);//We have imported RestAssured as static so directly got given() access here.
		
	}
	
	protected void setAuthToken(String token)
	{
		requestSpecification.header("Authorization","Bearer "+token);
	}
	
	//protected Response postRequest(LoginRequest payload,String endpoint)
	protected Response postRequest(Object payload,String endpoint)//We have did lose coupling here so any kind of post method can be perform here by taking this method, we have declared Object class instead of LoginRequest class
	{
		//Response response=requestSpecification.contentType(ContentType.JSON).body(payload).post(endpoint);
		//return response;
		return requestSpecification.contentType(ContentType.JSON).body(payload).post(endpoint);// code reduce
	}
	
	protected Response putRequest(Object payload,String endpoint)
	{
		
		return requestSpecification.contentType(ContentType.JSON).body(payload).put(endpoint);// code reduce
	}
	
	
	protected Response getRequest(String endpoint)
	{
		return requestSpecification.get(endpoint);
	}

}
