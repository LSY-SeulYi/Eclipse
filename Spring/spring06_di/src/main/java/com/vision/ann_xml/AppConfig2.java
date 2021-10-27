package com.vision.ann_xml;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.vision.common.Student;

@Configuration
@ComponentScan("AppConfig2")
public class AppConfig2 {

	@Bean
	public Student student5() {
		ArrayList<String> hobbys = new ArrayList<>();
		hobbys.add("무한정비맞기");
		hobbys.add("무한정먹기");
		Student st = new Student("황경",45,hobbys);
		st.setHeight(167);
		st.setWeight(73);
		
		return st;
	}
	
}
