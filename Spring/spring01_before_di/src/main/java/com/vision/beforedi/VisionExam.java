package com.vision.beforedi;

public class VisionExam implements Exam {

	private int kor, eng, math;
	
	public VisionExam() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VisionExam(int kor, int eng, int math) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	@Override
	public int total() {
		// TODO Auto-generated method stub
		return kor+eng+math;
	}

	@Override
	public float avg() {
		// TODO Auto-generated method stub
		return total()/3.0f;
	}

}
