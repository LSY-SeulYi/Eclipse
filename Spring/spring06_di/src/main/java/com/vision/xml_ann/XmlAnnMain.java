package com.vision.xml_ann;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vision.common.Student;

public class XmlAnnMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext cont = new AnnotationConfigApplicationContext(AppConfig3.class);
		
		Student st = cont.getBean("student1", Student.class);
		Student st2 = cont.getBean("student6", Student.class);
		System.out.println(st.getName());
		System.out.println(st2.getName());
		cont.close();
	}

}
