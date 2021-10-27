package com.vision.diex;

import java.util.ArrayList;

public class MyInfo {

	private String name;
	private double height;
	private double weight;
	private ArrayList<String> hobbys;
	private BMICalculator bmiCalc;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public ArrayList<String> getHobbys() {
		return hobbys;
	}
	public void setHobbys(ArrayList<String> hobbys) {
		this.hobbys = hobbys;
	}
	public BMICalculator getBmiCalc() {
		return bmiCalc;
	}
	public void setBmiCalc(BMICalculator bmiCalc) {
		this.bmiCalc = bmiCalc;
	}
	
	@Override
	public String toString() {
		return "MyInfo [name=" + name + ", height=" + height + ", weight=" + weight + ", hobbys=" + hobbys
				+ ", bmiCalc=" + bmiCalc + "]";
	}
	
	public String getInfo() {
		String info = "";
		System.out.println("이름:"+name);info+="이름:"+name+"\n";
		System.out.println("키:"+height);info+="키:"+height+"\n";
		System.out.println("몸무게:"+weight);info+="몸무게:"+weight+"\n";
		System.out.println("취미:"+hobbys);info+="취미:"+hobbys+"\n";
		System.out.println("BMI:"+bmiCalc.bmiCalculation(weight, height));info+="BMI:"+bmiCalc.bmiCalculation(weight, height)+"\n";
		return info;
	}
	
}
