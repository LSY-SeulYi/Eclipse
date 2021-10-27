package com.vision.aop_ex2;

public class Gugudan {

	// join point
	public void dispGugudan() {
		for(int i=2;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				System.out.println(i+"*"+j+"="+(i*j)+"\t");
			}
			System.out.println();
		}
	}
}
