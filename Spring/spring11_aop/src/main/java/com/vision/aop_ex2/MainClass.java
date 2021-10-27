package com.vision.aop_ex2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX.xml");
		Gugudan gugudan = ctx.getBean("gugudan", Gugudan.class);
		gugudan.dispGugudan();
		ctx.close();
	}

}
