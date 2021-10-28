package ai.uni.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import ai.uni.dto.UniPaging;
import ai.uni.dto.UniReplyVO;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class UniReplyMapperTests {

	// 테스트 전에 해당 게시뭏 번호가 존재하는지 반드시 확인 할 것
	private Long[] noArr = {10L, 12L, 13L, 14L, 15L};
	
	@Setter(onMethod_ = @Autowired)
	private UniReplyMapper mapper;
	
//	@Test
//	public void testCreate() {
//		IntStream.rangeClosed(1, 10).forEach(i -> {
//			UniReplyVO vo = new UniReplyVO();
//			
//			// 게시물의 번호
//			vo.setNo(noArr[i % 5]);
//			vo.setReply("댓글 테스트" + i);
//			vo.setReplyer("replyer" + i);
//			mapper.insert(vo);
//		});
//	}
//	
//	@Test
//	public void testMapper() {
//		log.info(mapper);
//	}
//	
//	@Test
//	public void testRead() {
//		Long targetRno = 7L;
//		UniReplyVO vo = mapper.read(targetRno);
//		log.info(vo);
//	}
//	
//	@Test
//	public void testDelete() {
//		mapper.delete(3);
//	}
	
//	@Test
//	public void testUpdate() {
//		Long targetRno = 17L;
//		UniReplyVO vo = mapper.read(targetRno);
//		vo.setReply("Update Reply");
//		int count = mapper.update(vo);
//		log.info("UPDATE COUNT : " + count);
//	}
	
	@Test
	public void testList() {
		UniPaging unip = new UniPaging();
		List<UniReplyVO> repl = mapper.getListWithPaging(unip, noArr[0]);
		repl.forEach(reply -> log.info(reply));
	}
	
	@Test
	public void testList2() {
		UniPaging unip = new UniPaging(1, 5);
		List<UniReplyVO> repl = mapper.getListWithPaging(unip, 10L);
		repl.forEach(reply -> log.info(reply));
	}
}
