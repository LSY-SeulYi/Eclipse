package com.vision.beforedi;

public class GridDisp implements ExamDisp {
	Exam exam;
	public GridDisp(Exam exam) {
		this.exam = exam;
		
	}
	@Override
	public void disp() {
		int total = exam.total();
		float avg = exam.avg();
		System.out.println("======================================================");
		System.out.println("             ÃÑ Á¡                  Æò ±Õ                ");
		System.out.println("======================================================");
		System.out.printf("             %3d                  %5.2f\n",total,avg);
		System.out.println("======================================================");

	}


	
}
