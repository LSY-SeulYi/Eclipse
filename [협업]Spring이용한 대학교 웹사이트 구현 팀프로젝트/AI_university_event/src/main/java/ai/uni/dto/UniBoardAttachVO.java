package ai.uni.dto;

import lombok.Data;

@Data
public class UniBoardAttachVO {

	private String uuid;
	private String uploadPath;
	private String fileName;
	private boolean fileType;
	  
	private Long no;
}
