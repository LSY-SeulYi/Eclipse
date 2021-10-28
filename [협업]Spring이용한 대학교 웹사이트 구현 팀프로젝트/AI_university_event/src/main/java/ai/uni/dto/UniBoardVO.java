package ai.uni.dto;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class UniBoardVO {

	private Long no;
	private String title;
	private String content;
	private String writer;
	private Date reg_date;
	private Date up_date;
	
	private int replyCnt;

	private List<UniBoardAttachVO> attachList;
}
