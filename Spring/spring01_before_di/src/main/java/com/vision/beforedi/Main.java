package com.vision.beforedi;

public class Main {

	public static void main(String[] args) {
		//�������̽� =       ����ü
		Exam exam = new VisionExam(100,80,79);
		ExamDisp disp = new InlineDisp(exam);
		ExamDisp disp2 = new GridDisp(exam);
		disp.disp();
		disp2.disp();
	}
}
