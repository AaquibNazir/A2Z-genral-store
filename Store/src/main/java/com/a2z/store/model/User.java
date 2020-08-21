package com.a2z.store.model;

import javax.validation.constraints.Size;

import org.springframework.validation.annotation.Validated;
public class  User {
	@Size(min = 4, max = 50, message 
			= "First name must be between 4 and 50 characters")
	private String firstName;
	@Size(min = 4, max = 50, message 
			= "second must be between 4 and 50 characters")
	private String secondName;
	@Size(min = 10, max = 13, message 
			= "mobile number must be between 10 and 13 digits")
	private String mobileNumber;
	@Size(min = 10, max = 200, message 
			= "email id must be between 10 and 200 characters or digits")
	private String emailid;

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

}
