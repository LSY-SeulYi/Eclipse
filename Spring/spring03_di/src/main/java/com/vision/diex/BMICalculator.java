package com.vision.diex;

public class BMICalculator {

	private double lowWeight; // ��ü��
	private double normal; // ����ü��
	private double overWeight; // ��ü��
	private double obesity; // ��
	
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
//		double res = weight/(h*h); ����
		double res = weight/Math.pow(h, 2.0); // ����
		String msg = "BMI ���� : "+(int)res;
		System.out.println(msg);
		
		if(res>=obesity) {
			msg += "\n�� �Դϴ�.";
		}else if(res>=overWeight) {
			msg += "\n��ü�� �Դϴ�.";
		}else if(res>=normal) {
			msg += "\n�����Դϴ�.";
		}else {
			msg += "\n��ü�� �Դϴ�.";
		}
		System.out.println(msg);
		return msg;
	}
}
