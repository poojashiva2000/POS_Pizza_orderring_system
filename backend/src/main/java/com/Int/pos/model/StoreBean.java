 package com.Int.pos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="POS_TBL_PizzaStore")
public class StoreBean {
	@Id
	@Column(name="storeid")
	private String storeID;
	private String name;
	private String street;
	private String mobile_no;
	private String city;
	private String state;
	private String pincode;
	public String getStoreID() {
		return storeID;
	}
	
	public void setStoreID(String storeID) {
		this.storeID = storeID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getmobile_no() {
		return mobile_no;
	}
	public void setMobileNo(String mobile_no) {
		this.mobile_no = mobile_no;
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

	@Override
	public String toString() {
		return "StoreBean [storeID=" + storeID + ", name=" + name + ", street=" + street + ", mobile_no=" + mobile_no
				+ ", city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
	}

}
