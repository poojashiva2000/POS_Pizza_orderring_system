package com.Int.pos.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="POS_TBL_User_Profile")
public class ProfileBean {
	@Id
	@GeneratedValue
	private int pvid;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="UserId",referencedColumnName="UserId")
	private CredentialBean credentialBean;
	private String firstName;
	private String lastName;
	private String dateOfBirth;
	private String gennder;
	private String street;
	private String location;
	private String city;
	private String state;
	private String pincode;
	private String mobileNo;
	private String emailID;
	private String password;
	
	
	
	public int getPvid() {
		return pvid;
	}
	public void setPvid(int pvid) {
		this.pvid = pvid;
	}
	public CredentialBean getCredentialBean() {
		return credentialBean;
	}
	public void setCredentialBean(CredentialBean credentialBean) {
		this.credentialBean = credentialBean;
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
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getGennder() {
		return gennder;
	}
	public void setGennder(String gennder) {
		this.gennder = gennder;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "ProfileBean [pvid=" + pvid + ", credentialBean=" + credentialBean + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", dateOfBirth=" + dateOfBirth + ", gennder=" + gennder + ", street="
				+ street + ", location=" + location + ", city=" + city + ", state=" + state + ", pincode=" + pincode
				+ ", mobileNo=" + mobileNo + ", emailID=" + emailID + ", password=" + password + "]";
	}
	

}
