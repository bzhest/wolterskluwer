package com.example.wolterskluwer.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Data{

	@JsonProperty("firstName")
	private String firstName;

	@JsonProperty("lastName")
	private String lastName;

	@JsonProperty("unid")
	private String unid;

	@JsonProperty("emailAddress")
	private String emailAddress;

	@JsonProperty("phoneNumber")
	private String phoneNumber;

	@JsonProperty("countryCode")
	private String countryCode;

	@JsonProperty("marketingConsent")
	private boolean marketingConsent;

	@JsonProperty("consentForDetails")
	private boolean consentForDetails;

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}

	public String getFirstName(){
		return firstName;
	}

	public void setLastName(String lastName){
		this.lastName = lastName;
	}

	public String getLastName(){
		return lastName;
	}

	public void setUnid(String unid){
		this.unid = unid;
	}

	public String getUnid(){
		return unid;
	}

	public void setEmailAddress(String emailAddress){
		this.emailAddress = emailAddress;
	}

	public String getEmailAddress(){
		return emailAddress;
	}

	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber(){
		return phoneNumber;
	}

	public void setCountryCode(String countryCode){
		this.countryCode = countryCode;
	}

	public String getCountryCode(){
		return countryCode;
	}

	public void setMarketingConsent(boolean marketingConsent){
		this.marketingConsent = marketingConsent;
	}

	public boolean isMarketingConsent(){
		return marketingConsent;
	}

	public void setConsentForDetails(boolean consentForDetails){
		this.consentForDetails = consentForDetails;
	}

	public boolean isConsentForDetails(){
		return consentForDetails;
	}

	@Override
 	public String toString(){
		return 
			"Data{" + 
			"firstName = '" + firstName + '\'' + 
			",lastName = '" + lastName + '\'' + 
			",unid = '" + unid + '\'' + 
			",emailAddress = '" + emailAddress + '\'' + 
			",phoneNumber = '" + phoneNumber + '\'' + 
			",countryCode = '" + countryCode + '\'' + 
			",marketingConsent = '" + marketingConsent + '\'' + 
			",consentForDetails = '" + consentForDetails + '\'' + 
			"}";
		}
}