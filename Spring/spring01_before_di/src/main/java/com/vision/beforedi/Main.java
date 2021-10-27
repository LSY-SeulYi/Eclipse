package com.vision.beforedi;

public class Main {

	public static void main(String[] args) {
		//인터페이스 =       구현체
		Exam exam = new VisionExam(100,80,79);
		ExamDisp disp = new InlineDisp(exam);
		ExamDisp disp2 = new GridDisp(exam);
		disp.disp();
		disp2.disp();
	}
}
