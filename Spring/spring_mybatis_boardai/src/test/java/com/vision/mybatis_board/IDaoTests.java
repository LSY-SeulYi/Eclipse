package com.vision.mybatis_board;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.vision.mybatis_board.dto.MemberDTO;
import com.vision.mybatis_board.mapper.IDao;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class IDaoTests {

	@Setter(onMethod_ = @Autowired(required=false))
	private IDao idao;
	
	@Test
	public void testBean() {
		assertNotNull(idao);
	}
	
	@Test
	public void testInsert() {
		idao.insert("user97", "뉴유저2", "1234");
	}

	@Test
	public void testDelete() {
		idao.delete("user98");
	}
}
