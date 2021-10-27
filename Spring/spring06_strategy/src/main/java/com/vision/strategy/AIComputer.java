package com.vision.strategy;

import java.util.ArrayList;

public class AIComputer implements Goods {

	public int price;
	public ArrayList<String> customers;
	
	@Override
	public String sale() {
		// TODO Auto-generated method stub
		return "성능좋은 인공지능 컴퓨터 입니다.";
	}

	@Override
	public ArrayList<String> getCustomers() {
		// TODO Auto-generated method stub
		return customers;
	}

	public AIComputer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AIComputer(int price) {
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
