package com.vision.mybatis_board.dto;

public class MemberDTO {

	private String memid;
	private String memname;
	private String mempw;

	
	public String getMemid() {
		return memid;
	}
	public void setMemid(String memid) {
		this.memid = memid;
	}
	public String getMemname() {
		return memname;
	}
	public void setMemname(String memname) {
		this.memname = memname;
	}
	public String getMempw() {
		return mempw;
	}
	public void setMempw(String mempw) {
		this.mempw = mempw;
	}

	
	public MemberDTO(String memid, String memname, String mempw) {
		super();
		this.memid = memid;
		this.memname = memname;
		this.mempw = mempw;

	}
	
	
	
}
