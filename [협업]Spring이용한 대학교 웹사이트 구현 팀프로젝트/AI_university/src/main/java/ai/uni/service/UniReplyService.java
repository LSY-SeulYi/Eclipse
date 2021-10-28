package ai.uni.service;

import java.util.List;

import ai.uni.dto.UniPaging;
import ai.uni.dto.UniReplyPageDTO;
import ai.uni.dto.UniReplyVO;

public interface UniReplyService {

	public int register(UniReplyVO vo);
	
	public UniReplyVO get(Long rno);
	
	public int modify(UniReplyVO vo);
	
	public int remove(Long rno);
	
	public List<UniReplyVO> getList(UniPaging unip, Long no);
	
	public UniReplyPageDTO getListPage(UniPaging unip, Long no);
}
