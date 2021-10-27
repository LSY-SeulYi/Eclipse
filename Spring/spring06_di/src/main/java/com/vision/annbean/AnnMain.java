package com.vision.annbean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vision.common.Student;

public class AnnMain {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext cont = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Student student1 = cont.getBean("student1", Student.class);
		System.out.println("이름 : "+student1.getName());
		System.out.println("나이 : "+student1.getAge());

		cont.close();
	}
}
