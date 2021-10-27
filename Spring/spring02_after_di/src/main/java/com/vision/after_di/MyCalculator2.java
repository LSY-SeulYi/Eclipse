package com.vision.after_di;

public class MyCalculator2 {

	// 세개의 멤버 필드
	Calculator calc;
	private double firstNum;
	private double secondNum;
	
	// 기본생성자
	public MyCalculator2() {
		super();
		// TODO Auto-generated constructor stub
	}

	// 세터게터
	public Calculator getCal() {
		return calc;
	}

	public void setCal(Calculator calc) {
		this.calc = calc;
	}

	public double getFirstNum() {
		return firstNum;
	}

	public void setFirstNum(double firstNum) {
		this.firstNum = firstNum;
	}

	public double getSecondNum() {
		return secondNum;
	}

	public void setSecondNum(double secondNum) {
		this.secondNum = secondNum;
	}

	public void add() {
		calc.add(firstNum,secondNum);
	}
	
	public void sub() {
		calc.sub(firstNum,secondNum);
	}
	
	public void mul() {
		calc.mul(firstNum,secondNum);
	}
	
	public void div() {
		calc.div(firstNum,secondNum);
	}
}
