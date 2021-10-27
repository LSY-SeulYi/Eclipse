package com.vision.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.vision.common.Family;
import com.vision.common.Student;
import com.vision.common.StudentInfo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ctx = "classpath:appCTX01.xml";
		String ctx2 = "classpath:appCTX02.xml";
		AbstractApplicationContext cont = new GenericXmlApplicationContext(ctx,ctx2);
		
		Student s1 = cont.getBean("student1",Student.class);
		System.out.println(s1.getName());
		System.out.println(s1.getHobbys());
		
		StudentInfo sInfor = cont.getBean("studentInfo1",StudentInfo.class);
		Student s2 = sInfor.getStudent();
		System.out.println(s2.getName());
		System.out.println(s2.getHobbys());
		
		if(s1.equals(s2)) {
			System.out.println("s1==s2");
		}else {
			System.out.println("s1 != s2");
		}
		
		Student s3 = cont.getBean("student3", Student.class);
		System.out.println(s3.getName());
		System.out.println(s3.getHobbys());
		
		Family fam = cont.getBean("family", Family.class);
		System.out.println(fam.getPapaName());
		System.out.println(fam.getMamaName());
		System.out.println(fam.getSisterName());
		System.out.println(fam.getBrotorName());
		
		cont.close();
	}

}
