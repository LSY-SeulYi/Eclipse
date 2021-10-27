package com.vision.diex;

public class BMICalculator {

	private double lowWeight; // 저체중
	private double normal; // 정상체중
	private double overWeight; // 과체중
	private double obesity; // 비만
	
	public void setLowWeight(double lowWeight) {
		this.lowWeight = lowWeight;
	}
	public void setNormal(double normal) {
		this.normal = normal;
	}
	public void setOverWeight(double overWeight) {
		this.overWeight = overWeight;
	}
	public void setObesity(double obesity) {
		this.obesity = obesity;
	}
	
	public String bmiCalculation(double weight, double height) {
		
		double h = height*0.01;
//		double res = weight/(h*h); 제곱
		double res = weight/Math.pow(h, 2.0); // 제곱
		String msg = "BMI 지수 : "+(int)res;
		System.out.println(msg);
		
		if(res>=obesity) {
			msg += "\n비만 입니다.";
		}else if(res>=overWeight) {
			msg += "\n과체중 입니다.";
		}else if(res>=normal) {
			msg += "\n정상입니다.";
		}else {
			msg += "\n저체중 입니다.";
		}
		System.out.println(msg);
		return msg;
	}
}
