package com.Int.pos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="POS_TBL_Food")

public class FoodBean {
	@Id
@Column(name="foodid")
	private String foodID;
	private String name;
		private String type;
		private String foodSize;
	private String quantity;
	private String price;
	public String getFoodID() {
		return foodID;
	}
	public void setFoodID(String foodID) {
		this.foodID = foodID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getFoodSize() {
		return foodSize;
	}
	public void setFoodSize(String foodSize) {
		this.foodSize = foodSize;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "FoodBean [foodID=" + foodID + ", name=" + name + ", type=" + type + ", foodSize=" + foodSize
				+ ", quantity=" + quantity + ", price=" + price + "]";
	}
	

}
