package com.vision.diex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.vision.diex02.StudentInfo;

public class Main {

	public static void main(String[] args) {
		

		String location2 = "classpath:studentsettings.xml";
		AbstractApplicationContext container2 = new GenericXmlApplicationContext(location2);
		StudentInfo studentInfo = container2.getBean("studentInfo",StudentInfo.class);
		StudentInfo studentInfo2 = container2.getBean("studentInfo2",StudentInfo.class);
		String res = studentInfo.getStudentInfo();
		String res2 = studentInfo2.getStudentInfo();
		container2.close();
		
	}
}
