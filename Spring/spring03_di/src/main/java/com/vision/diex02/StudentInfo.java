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
			info += "이름 : "+student.getName()+"\n";
			info += "나이 : "+student.getAge()+"\n";
			info += "학년 : "+student.getGradeNum()+"\n";
			info += "반 : "+student.getClassNum()+"\n";
		}
		return info;
	}
}
