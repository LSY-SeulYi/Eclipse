package ai.uni.mapper;

import java.util.List;

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
public class UniBoardMapperTests {

	@Setter(onMethod_ = @Autowired)
	private UniBoardMapper mapper;
	
	@Test
	public void testList() {
		mapper.getList().forEach(uni_board -> log.info(uni_board));
	}
	
	@Test
	public void testInsert() {
		UniBoardVO uniBoard = new UniBoardVO();
		uniBoard.setTitle("새로 작성하는 글");
		uniBoard.setContent("새로 작성하는 내용");
		uniBoard.setWriter("newuser");
		mapper.insert(uniBoard);
		log.info(uniBoard);
	}
	
	@Test
	public void testInsertSelectKey() {
		UniBoardVO uniBoard = new UniBoardVO();
		uniBoard.setTitle("새로 작성하는 글 select key");
		uniBoard.setContent("새로 작성하는 내용 select key");
		uniBoard.setWriter("newuser");
		mapper.insertSelectKey(uniBoard);
		log.info(uniBoard);
	}
	
	@Test
	public void testRead() {
		
		// 존재하는 게시물 번호로 테스트
		UniBoardVO uniBoard = mapper.read(3L);

		log.info(uniBoard);
	}
	
//	@Test
//	public void testDelete() {
//
//		log.info("DELETE COUNT : "+mapper.delete(2L));
//	}
	
	@Test
	public void testUpdate() {
		UniBoardVO uniBoard = new UniBoardVO();
		// 실행 전 존재하는 게시물 번호인지 확인 할 것
		uniBoard.setNo(4L);
		uniBoard.setTitle("수정된 제목");
		uniBoard.setContent("수정된 내용");
		uniBoard.setWriter("user00");
		int count = mapper.update(uniBoard);
		log.info("UPDATE COUNT : "+count);
	}
	
	@Test
	public void testPaging() {
		
		UniPaging unip = new UniPaging();
		// 10개씩 3페이지
		unip.setPageNum(3);
		unip.setAmount(10);
		List<UniBoardVO> list = mapper.getListWithPaging(unip);
		list.forEach(uniBoard -> log.info(uniBoard));
	}
	
	@Test
	public void testSearch() {
		UniPaging unip = new UniPaging();
		unip.setKeyword("새로");
		unip.setType("TC");
		List<UniBoardVO> list = mapper.getListWithPaging(unip);
		list.forEach(uniBoard -> log.info(uniBoard));
	}

}
