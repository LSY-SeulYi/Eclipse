package com.vision.mybatis_board.dao;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.io.support.ResourcePropertySource;

import com.vision.mybatis_board.dto.BDto;

public class BDaoTest {

	static GenericXmlApplicationContext gctx;
	static ConfigurableEnvironment env;
	
	@Autowired
	BDao bdao;
	@Autowired
	BDto bdto;
	
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
		propertySources.addLast(new ResourcePropertySource("classpath:test.properties"));
		gctx = (GenericXmlApplicationContext)ctx;
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception{
		gctx.close();
	}
	
	@Test
	public void testContentView() {
		gctx.load("appCTX.xml");
		BDto bdto = gctx.getBean("bdto",BDto.class);
		bdto.getBname();
		bdto.getBtitle();
		assertTrue(env.getProperty("test.bname").equals("LSY"));
		assertTrue(env.getProperty("test.btitle").equals("비오는 가을날"));
	}

	@Test
	public void testWrite() {
		
	}

	@Test
	public void testList() {
		gctx.load("appCTX.xml");

		BDto bdto = gctx.getBean("bdto",BDto.class);
		assertTrue(bdto.getBname().equals(env.getProperty("hh")));
		assertTrue(bdto.getBtitle().equals(env.getProperty("ht")));
		assertTrue(bdto.getBcontent().equals(env.getProperty("ht")));
	}

	@Test
	public void testModify() {
		fail("Not yet implemented");
	}

	@Test
	public void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	public void testReply() {
		fail("Not yet implemented");
	}

	@Test
	public void testReply_view() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpHit() {
		fail("Not yet implemented");
	}

}
