package com.vision.beforedi;

public class InlineDisp implements ExamDisp {
	Exam exam;
	public InlineDisp(Exam exam) {
		this.exam = exam;

	}
	
	@Override
	public void disp() {
		int total = exam.total();
		float avg = exam.avg();
		System.out.println("total: "+total+" avg: "+avg);
		
	}
}
