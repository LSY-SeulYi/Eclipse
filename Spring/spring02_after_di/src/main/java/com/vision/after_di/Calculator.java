package com.vision.after_di;

public class Calculator {

//	���ϱ�, ����, ���ϱ�, ������
	public void add (double a, double b) {
		System.out.println("���ϱ�");
		double res = a+b;
		System.out.println(a+"+"+b+"="+res);
	}
	
	public void sub (double a, double b) {
		System.out.println("����");
		double res = a-b;
		System.out.println(a+"-"+b+"="+res);
	}
	
	public void mul (double a, double b) {
		System.out.println("���ϱ�");
		double res = a*b;
		System.out.println(a+"*"+b+"="+res);
	}
	
	public void div (double a, double b) {
		System.out.println("������");
		double res = a/b;
		System.out.println(a+"/"+b+"="+res);
	}
	

}
