package ai.uni.dto;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class UniPageDTO {

	private int firstPage;
	private int endPage;
	private boolean prev, next;
	
	private int total;
	private UniPaging unip;
	
	public UniPageDTO(UniPaging unip, int total) {
		this.unip = unip;
		this.total = total;
		this.endPage = (int) (Math.ceil(unip.getPageNum() / 10.0)) * 10;
		this.firstPage = this.endPage - 9;
		
		int realEnd = (int) (Math.ceil((total * 1.0) / unip.getAmount()));
		if (realEnd < this.endPage) {
			this.endPage = realEnd;
		}
		this.prev = this.firstPage > 1;
		this.next = this.endPage < realEnd;
	}
	
}
