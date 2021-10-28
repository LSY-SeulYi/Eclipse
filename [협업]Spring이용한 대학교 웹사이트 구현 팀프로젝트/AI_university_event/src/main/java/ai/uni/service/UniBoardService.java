package ai.uni.service;

import java.util.List;

import ai.uni.dto.UniBoardAttachVO;
import ai.uni.dto.UniBoardVO;
import ai.uni.dto.UniPaging;

public interface UniBoardService {

	public void register(UniBoardVO uniBoard);
	
	public UniBoardVO get(Long no);
	
	public boolean modify(UniBoardVO uniBoard);
	
	public boolean remove(Long no);
	
	//public List<UniBoardVO> getList();
	public List<UniBoardVO> getList(UniPaging unip);
	
	public int getTotal(UniPaging unip);
	
	public List<UniBoardAttachVO> getAttachList(Long bno);
}
