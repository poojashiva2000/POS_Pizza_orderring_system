package com.Int.pos.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="POS_TBL_Cart")

public class CartBean {
	@Id
	@Column(name="cartid")
	private String cartID;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="UserId", referencedColumnName="userid")
	private CredentialBean credentialBean;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="fkid")
	private FoodBean foodBean;
	private String type;
	private String quantity;
	private String cost;
	private String orderDate;
	public String getCartID() {
		return cartID;
	}
	public void setCartID(String cartID) {
		this.cartID = cartID;
	}
	public CredentialBean getCredentialBean() {
		return credentialBean;
	}
	public void setCredentialBean(CredentialBean credentialBean) {
		this.credentialBean = credentialBean;
	}
	public FoodBean getFoodBean() {
		return foodBean;
	}
	public void setFoodBean(FoodBean foodBean) {
		this.foodBean = foodBean;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	

}
