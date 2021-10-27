package com.vision.ann_xml;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.vision.common.Student;
@ComponentScan("AppConfig2")
public class AnnXmlMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:appCTX03.xml");
				
		Student st2 = ctx.getBean("student4", Student.class);
		Student st = ctx.getBean("student5", Student.class);
		
		
		System.out.println(st2.getName());
		System.out.println(st.getName());
		
		ctx.close();
	}
}
