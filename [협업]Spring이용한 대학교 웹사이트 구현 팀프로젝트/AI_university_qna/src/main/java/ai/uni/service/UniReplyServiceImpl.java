package ai.uni.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ai.uni.dto.UniPaging;
import ai.uni.dto.UniReplyPageDTO;
import ai.uni.dto.UniReplyVO;
import ai.uni.mapper.UniBoardMapper;
import ai.uni.mapper.UniReplyMapper;
import lombok.Setter;
import lombok.extern.log4j.Log4j;


@Service
@Log4j
public class UniReplyServiceImpl implements UniReplyService {

	@Setter(onMethod_ = @Autowired)
	private UniReplyMapper mapper;
	
	@Setter(onMethod_ = @Autowired)
	private UniBoardMapper boardMapper;
	
	@Override
	public int register(UniReplyVO vo) {
		log.info("register : "+vo);
		boardMapper.updateReplyCnt(vo.getNo(), 1);
		return mapper.insert(vo);
	}

	@Override
	public UniReplyVO get(Long rno) {
		log.info("get : "+rno);
		return mapper.read(rno);
	}

	@Override
	public int modify(UniReplyVO vo) {
		log.info("modify : "+vo);
		return mapper.update(vo);
	}

//	@Override
//	public int remove(Long rno) {
//		log.info("remove : "+rno);
//		return mapper.delete(rno);
//	}
	@Transactional
	@Override
	public int remove(Long rno) {
		log.info("remove : " + rno);
		UniReplyVO vo = mapper.read(rno);
		boardMapper.updateReplyCnt(vo.getNo(), -1);
		return mapper.delete(rno);
	}

	@Override
	public List<UniReplyVO> getList(UniPaging unip, Long no) {
		log.info("get Reply List of a Board" +no);
		return mapper.getListWithPaging(unip, no);
	}
	
	@Override
	public UniReplyPageDTO getListPage(UniPaging unip, Long no) {
		return new UniReplyPageDTO(mapper.getCountByNo(no), mapper.getListWithPaging(unip, no));
	}

}
