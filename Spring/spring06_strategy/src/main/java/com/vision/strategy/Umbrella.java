package com.vision.strategy;

import java.util.ArrayList;

public class Umbrella implements Goods {

	public int price;
	public ArrayList<String> customers;
	
	@Override
	public String sale() {
		// TODO Auto-generated method stub
		return "우산 싸게 팔아요~~";
	}

	@Override
	public ArrayList<String> getCustomers() {
		// TODO Auto-generated method stub
		return customers;
	}

	public Umbrella() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Umbrella(int price) {
		super();
		this.price = price;

	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setCustomers(ArrayList<String> customers) {
		this.customers = customers;
	}
	
	

}
