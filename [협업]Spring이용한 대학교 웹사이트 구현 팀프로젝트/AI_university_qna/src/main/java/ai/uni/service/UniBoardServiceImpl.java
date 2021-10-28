package ai.uni.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ai.uni.dto.UniBoardAttachVO;
import ai.uni.dto.UniBoardVO;
import ai.uni.dto.UniPaging;
import ai.uni.mapper.UniBoardAttachMapper;
import ai.uni.mapper.UniBoardMapper;
import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j;


@Log4j
@Service
@AllArgsConstructor
public class UniBoardServiceImpl implements UniBoardService {

	// spring 4.3 이상에서 자동 처리
	@Setter(onMethod_ = @Autowired)
	private UniBoardMapper mapper;
	
	@Setter(onMethod_ = @Autowired)
	private UniBoardAttachMapper attachMapper;
	
	@Transactional
	@Override
	public void register(UniBoardVO uniBoard) {
		log.info("register : " + uniBoard);
		mapper.insertSelectKey(uniBoard);
		if (uniBoard.getAttachList() == null || uniBoard.getAttachList().size() <= 0) {
			return;
		}
		uniBoard.getAttachList().forEach(attach -> {
			attach.setNo(uniBoard.getNo());
			attachMapper.insert(attach);
		});
	}

	@Override
	public UniBoardVO get(Long no) {
		
		log.info("get : "+no);
		return mapper.read(no);
	}

	@Transactional
	@Override
	public boolean modify(UniBoardVO uniBoard) {
		
		log.info("modify : "+uniBoard);
		attachMapper.deleteAll(uniBoard.getNo());
		boolean modifyResult = mapper.update(uniBoard) == 1;
		
		if (modifyResult && uniBoard.getAttachList() != null) {
			uniBoard.getAttachList().forEach(attach -> {
				attach.setNo(uniBoard.getNo());
				attachMapper.insert(attach);
			});
		}
		return modifyResult;
	}

	@Transactional
	@Override
	public boolean remove(Long no) {
		log.info("remove : "+no);
		attachMapper.deleteAll(no);
		return mapper.delete(no) == 1;
	}

//	@Override
//	public List<UniBoardVO> getList() {
//		
//		log.info("getList");
//		return mapper.getList();
//	}
	@Override
	public List<UniBoardVO> getList(UniPaging unip) {
		
		log.info("get List with UniPaging : "+unip);
		return mapper.getListWithPaging(unip);
	}
	
	@Override
	public int getTotal(UniPaging unip) {
		log.info("get total count");
		return mapper.getTotalCount(unip);
	}
	
	@Override
	public List<UniBoardAttachVO> getAttachList(Long no) {
		log.info("get Attach list by no" + no);
		return attachMapper.findByNo(no);
	}

}
