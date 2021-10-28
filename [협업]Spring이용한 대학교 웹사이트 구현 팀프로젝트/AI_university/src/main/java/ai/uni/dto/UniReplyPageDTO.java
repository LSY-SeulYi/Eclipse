package ai.uni.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data
@AllArgsConstructor
@Getter
public class UniReplyPageDTO {

	private int replyCnt;
	private List<UniReplyVO> list;
}
