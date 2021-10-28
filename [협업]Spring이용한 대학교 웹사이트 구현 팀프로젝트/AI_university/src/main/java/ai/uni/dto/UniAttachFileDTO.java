package ai.uni.dto;

import lombok.Data;

@Data
public class UniAttachFileDTO {

	private String fileName;
	private String uploadPath;
	private String uuid;
	private boolean image;
}
