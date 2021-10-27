package com.vision.diex02;

public class StudentInfo {

	private Student student;

	public StudentInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentInfo(Student student) {
		super();
		this.student = student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	public String getStudentInfo() {
		String info = "";
		if(student !=null) {
			info += "�̸� : "+student.getName()+"\n";
			info += "���� : "+student.getAge()+"\n";
			info += "�г� : "+student.getGradeNum()+"\n";
			info += "�� : "+student.getClassNum()+"\n";
		}
		return info;
	}
}
