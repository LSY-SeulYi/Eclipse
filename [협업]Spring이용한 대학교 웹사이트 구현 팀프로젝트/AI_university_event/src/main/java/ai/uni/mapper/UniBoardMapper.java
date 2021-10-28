package ai.uni.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import ai.uni.dto.UniBoardAttachVO;
import ai.uni.dto.UniBoardVO;
import ai.uni.dto.UniPaging;

public interface UniBoardMapper {

	public List<UniBoardVO> getList();
	
	public List<UniBoardVO> getListWithPaging(UniPaging unip);
	
	public void insert(UniBoardVO uniBoard);
	
	public Integer insertSelectKey(UniBoardVO uniBoard);
	
	public UniBoardVO read(Long no);
	
	public int delete(Long no);
	
	public int update(UniBoardVO uniBoard);
	
	public int getTotalCount(UniPaging unip);
	
	public void updateReplyCnt(@Param("no") Long no, @Param("amount") int amount);
	
	public List<UniBoardAttachVO> findByNo(Long no);
}
