package com.vision.annbean;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.vision.common.Student;

@Configuration
public class AppConfig {

	@Bean
	public Student student1() {
		ArrayList<String> hobbys = new ArrayList<>();
		hobbys.add("����");
		hobbys.add("�丮");
		
		Student student = new Student("ȫ�浿",20,hobbys);
		student.setHeight(187);
		student.setWeight(84);
		
		return student;
	}
	
}
