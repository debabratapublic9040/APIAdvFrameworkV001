package com.api.model.reponse;

public class UserProfileGetResponse {
	
	private int id;
	private String username;
	private String email;
	private String firstName;
	private String lastName;
	private String mobileNumber;
	
	public UserProfileGetResponse() 
	{
		//This constructor we are using for jackson binding
	}
	
	public UserProfileGetResponse(int id, String username, String email, String firstName, String lastName,
			String mobileNumber) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
	public String getmobileNumber() {
		return mobileNumber;
	}
	public void setmobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	@Override
	public String toString() {
		return "UserProfileGetResponse [id=" + id + ", username=" + username + ", email=" + email + ", firstName="
				+ firstName + ", lastName=" + lastName + ", mobileNumber=" + mobileNumber + "]";
	}
	
	

}
