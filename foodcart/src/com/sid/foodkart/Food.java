package com.sid.foodkart;

public class Food {

	int id;
	String item;
	int price;
	
	public Food(int id, String item, int price) {
		super();
		this.id = id;
		this.item = item;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
