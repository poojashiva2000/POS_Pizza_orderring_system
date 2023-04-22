
package com.Int.pos.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="POS_TBL_Order")

public class OrderBean {
	@Id
	@Column(name="orderid")
	private String orderID ;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="UserId", referencedColumnName="userid")
	private CredentialBean credentialBean;
	private String orderDate;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="StoreId", referencedColumnName="storeid")
	private StoreBean storeBean;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="CartId", referencedColumnName="cartid")
	
	private CartBean cartBean;
	private String totalPrice ;
	private String orderStatus ;
	private String  street;
	private String city ;
	private String state;
	private String pincode;
	private String mobileNo;
	public String getOrderID() {
		return orderID;
	}
	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}
	
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public CredentialBean getCredentialBean() {
		return credentialBean;
	}
	public void setCredentialBean(CredentialBean credentialBean) {
		this.credentialBean = credentialBean;
	}
	public StoreBean getStoreBean() {
		return storeBean;
	}
	public void setStoreBean(StoreBean storeBean) {
		this.storeBean = storeBean;
	}
	public CartBean getCartBean() {
		return cartBean;
	}
	public void setCartBean(CartBean cartBean) {
		this.cartBean = cartBean;
	}
	public String getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
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
	
	
	

}
