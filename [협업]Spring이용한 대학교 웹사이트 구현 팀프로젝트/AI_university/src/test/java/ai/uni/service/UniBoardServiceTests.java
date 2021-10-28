package ai.uni.service;

import static org.junit.Assert.assertNotNull;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ai.uni.dto.UniBoardVO;
import ai.uni.dto.UniPaging;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class UniBoardServiceTests {

	@Setter(onMethod_ = {@Autowired} )
	private UniBoardService uniservice;
	
	@Test
	public void test() {
		
		log.info(uniservice);
		assertNotNull(uniservice);
	}
	
	@Test
	public void testRegister() {
		
		UniBoardVO uniBoard = new UniBoardVO();
		uniBoard.setTitle("신규 글");
		uniBoard.setContent("신규 내용");
		uniBoard.setWriter("user01");
		uniservice.register(uniBoard);
		log.info("생성된 게시물의 번호 : "+uniBoard.getNo());
	}
	
//	@Test
//	public void testGetList() {
//		
//		uniservice.getList().forEach(uniBoard -> log.info(uniBoard));
//	}
	@Test
	public void testGetList() {
		
		uniservice.getList(new UniPaging(2,10)).forEach(uniBoard -> log.info(uniBoard));
	}
	
	@Test
	public void testGet() {
		
		log.info(uniservice.get(5L));
	}
	
//	@Test
//	public void testDelete() {
//		
//		// 게시물 번호의 존재 여부 및 삭제 확인을 하고 테스트 할 것
//		log.info("REMOVE RESULT : "+uniservice.remove(16L));
//	}
	
	@Test
	public void testUpdate() {
		
		UniBoardVO uniBoard = uniservice.get(13L);
		if (uniBoard == null) {
			return;
		}
		uniBoard.setTitle("제목 수정");
		log.info("MODIFY RESULT : "+uniservice.modify(uniBoard));
	}
}
