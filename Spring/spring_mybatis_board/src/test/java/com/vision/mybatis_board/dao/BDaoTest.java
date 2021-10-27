package com.vision.mybatis_board.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.vision.mybatis_board.dto.BDto;
import com.vision.mybatis_board.service.MessageListView;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BDaoTest {

	@Setter(onMethod_ = @Autowired)
	private BDao bdao;
	
	@Test
	public void testContentView() {
		BDto bdto = bdao.contentView(3);
	}

	@Test
	public void testWrite() {
		BDto bdto = new BDto();
		bdto.setBname("user");
		bdao.write("user", "title", "content");
		log.info(bdto);
	}

	@Test
	public void testList() {
		bdao.list().forEach(board -> log.info(board));
	}

	@Test
	public void testModify() {
		BDto bdto = new BDto();
		bdao.modify(9, "newname", "newtitle", "newcontent");
		log.info(bdto);
	}

	@Test
	public void testDelete() {
		bdao.delete("9");
	}

	@Test
	public void testReply() {
		MessageListView mv = new MessageListView(1);
		List<BDto> dto = bdao.reply_view(3);
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
