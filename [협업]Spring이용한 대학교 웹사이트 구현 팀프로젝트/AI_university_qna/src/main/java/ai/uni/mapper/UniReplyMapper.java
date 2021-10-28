package ai.uni.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import ai.uni.dto.UniPaging;
import ai.uni.dto.UniReplyVO;

public interface UniReplyMapper {

	public int insert(UniReplyVO vo);
	
	public UniReplyVO read(Long no);
	
	public int delete(Long rno);
	
	public int update(UniReplyVO reply);
	
	public List<UniReplyVO> getListWithPaging(@Param("unip") UniPaging unip, @Param("no") Long no);
	
	public int getCountByNo(Long no);
}
