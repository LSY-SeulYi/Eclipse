package com.vision.lifecycle;

import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.io.support.ResourcePropertySource;

public class TestCases {
// 생명 주기 테스트
	
	static GenericXmlApplicationContext gctx;
	static ConfigurableEnvironment env;
	
//	2개의 테스트
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
//		xml 환경파일을 사용할 수 있는 환경 컨텍스트 객체를 만듦
		ConfigurableApplicationContext ctx = new GenericXmlApplicationContext();
//		환경 컨텍스트 객체에서 환경객체를 가지고 옴
		env = ctx.getEnvironment();
//		환경 객체에서 가변속성 소스를 얻어 옴
		MutablePropertySources propertySources = env.getPropertySources();
//		가변 속성 소스에 사용자가 만든 자원 속성 소스를 추가한다.
//		클래스패스에 'admin.properties'라는 파일이 자원소스 속성이다.
		propertySources.addLast(new ResourcePropertySource("classpath:admin.properties"));
		gctx = (GenericXmlApplicationContext)ctx;
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception{
		gctx.close();
	}
	
	@Test
	public void test01() {
//		환경파일 등록 후 정보 읽어 오기 테스트
		assertTrue(env.getProperty("admin.id").equals("ai403"));
		assertTrue(env.getProperty("admin.pw").equals("java"));
	}
	
	@Test
	public void test02() {
//		다시 불러올때
		gctx.load("appCTX.xml");
		gctx.refresh();
		AdminConnection adminConn = gctx.getBean("adminConnection",AdminConnection.class);
		assertTrue(adminConn.getAdminId().equals("ai403"));
		assertTrue(adminConn.getAdminPw().equals("java"));
		System.out.println("admin Env : "+adminConn.getEnv());
	}
}
