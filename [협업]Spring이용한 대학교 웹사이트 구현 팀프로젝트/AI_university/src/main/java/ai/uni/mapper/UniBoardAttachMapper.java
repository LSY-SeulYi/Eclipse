package ai.uni.mapper;

import java.util.List;

import ai.uni.dto.UniBoardAttachVO;

public interface UniBoardAttachMapper {

	public void insert(UniBoardAttachVO vo);

	public void delete(String uuid);

	public List<UniBoardAttachVO> findByNo(Long no);

	public void deleteAll(Long no);

	public List<UniBoardAttachVO> getOldFiles();
}
