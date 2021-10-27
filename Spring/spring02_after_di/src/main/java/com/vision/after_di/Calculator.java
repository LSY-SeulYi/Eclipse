package com.vision.after_di;

public class Calculator {

//	더하기, 빼기, 곱하기, 나누기
	public void add (double a, double b) {
		System.out.println("더하기");
		double res = a+b;
		System.out.println(a+"+"+b+"="+res);
	}
	
	public void sub (double a, double b) {
		System.out.println("빼기");
		double res = a-b;
		System.out.println(a+"-"+b+"="+res);
	}
	
	public void mul (double a, double b) {
		System.out.println("곱하기");
		double res = a*b;
		System.out.println(a+"*"+b+"="+res);
	}
	
	public void div (double a, double b) {
		System.out.println("나누기");
		double res = a/b;
		System.out.println(a+"/"+b+"="+res);
	}
	

}
