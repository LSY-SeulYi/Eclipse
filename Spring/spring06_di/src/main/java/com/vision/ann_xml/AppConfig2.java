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
		hobbys.add("��������±�");
		hobbys.add("�������Ա�");
		Student st = new Student("Ȳ��",45,hobbys);
		st.setHeight(167);
		st.setWeight(73);
		
		return st;
	}
	
}
