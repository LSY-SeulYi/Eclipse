package com.vision.xml_ann;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import com.vision.common.Student;

@Configuration
@ImportResource("classpath:appCTX01.xml")
public class AppConfig3 {

	@Bean
	public Student student6() {
		
		ArrayList<String> hobbys = new ArrayList<>();
		hobbys.add("�������");
		hobbys.add("�ȭ������");
		Student st = new Student("����ġ",45,hobbys);
		st.setHeight(154);
		st.setWeight(78);
		
		return st;
		
	}
}
