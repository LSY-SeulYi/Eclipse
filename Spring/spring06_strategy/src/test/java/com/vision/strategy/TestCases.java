package com.vision.strategy;

import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestCases {

	@Test // 테스트케이스임을 알리는 어노테이션
	public void testOfStrategy() {
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:appCTX.xml");
		Goods goods = ctx.getBean("strategy",Goods.class);
		System.out.println("");
		System.out.println(goods.sale());
		System.out.println("");
		System.out.println("==== 주요 고객 명단 ====");
		for(String x:goods.getCustomers()) {
			System.out.println(x);
		}
		System.out.println("");
		ctx.close();
	}
	
}
