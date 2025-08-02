package com.api.model.request;

public class SignUpRequest {
	
	  private String username;
	  private String password; 
	  private String email; 
	  private String firstName; 
	  private String lastName; 
	  private String mobileNumber;
	  //Here we can declare the constructor as private so the object creation is possible only inside the 
	  //class, here we are restricting the object creation outside the class. And in this class we have created 
	  //SignUpRequest class object inside the Builder class and Builder class is the inner class of SignUpRequest
	  //, this is not mandatory, we can also declare the constructor as public.  
	  private SignUpRequest(String username, String password, String email, String firstName, String lastName,
			String mobileNumber) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
	  }
	  public String getUsername() {
		  return username;
	  }
	  public void setUsername(String username) {
		  this.username = username;
	  }
	  public String getPassword() {
		  return password;
	  }
	  public void setPassword(String password) {
		  this.password = password;
	  }
	  public String getEmail() {
		  return email;
	  }
	  public void setEmail(String email) {
		  this.email = email;
	  }
	  public String getFirstName() {
		  return firstName;
	  }
	  public void setFirstName(String firstName) {
		  this.firstName = firstName;
	  }
	  public String getLastName() {
		  return lastName;
	  }
	  public void setLastName(String lastName) {
		  this.lastName = lastName;
	  }
	  public String getMobileNumber() {
		  return mobileNumber;
	  }
	  public void setMobileNumber(String mobileNumber) {
		  this.mobileNumber = mobileNumber;
	  }
	  @Override
	  public String toString() {
		return "SignUpRequest [username=" + username + ", password=" + password + ", email=" + email + ", firstName="
				+ firstName + ", lastName=" + lastName + ", mobileNumber=" + mobileNumber + "]";
	  }
	  
	  public static class Builder
	  {
		  private String username;
		  private String password; 
		  private String email; 
		  private String firstName; 
		  private String lastName; 
		  private String mobileNumber;
		  
		  public Builder username(String username)
		  {
			  this.username= username;
			  //Builder x=new Builder();//Here object will be created for the Builder class
			  //in above line code we are creating new class object reference
			  Builder x=this;
			  //in above line code we are getting current class object reference and below we are returning same.
			  return x;
			  //return this;// here we are returning this class object reference directly.This is the direct short cut.
		  }
		  public Builder password(String password)
		  {
			  this.password= password;
			  return this;// here we are returning this class object reference directly.This is the direct short cut.
		  }
		  public Builder email(String email)
		  {
			  this.email= email;
			  return this; 
		  }
		  public Builder firstName(String firstName)
		  {
			  this.firstName= firstName;
			  return this;
		  }
		  public Builder lastName(String lastName)
		  {
			  this.lastName= lastName;
			  return this;
		  }
		  public Builder mobileNumber(String mobileNumber)
		  {
			  this.mobileNumber= mobileNumber;
			  return this;
		  }
		  
		  public SignUpRequest builder()
		  {
			  SignUpRequest signUpRequest=new SignUpRequest(username, password,email,firstName, lastName, mobileNumber);
			  
			  return signUpRequest;
		  }
	  }
 }
