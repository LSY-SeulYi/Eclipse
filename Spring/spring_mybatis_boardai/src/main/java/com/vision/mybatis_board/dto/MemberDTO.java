package com.vision.mybatis_board.dto;

public class MemberDTO {

	private int bid;
	private String memid;
	private String memname;
	private String mempw;
	
	public MemberDTO(int bid, String memid, String memname, String mempw) {
		super();
		this.bid = bid;
		this.memid = memid;
		this.memname = memname;
		this.mempw = mempw;
	}
	
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
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

	@Override
	public String toString() {
		return "MemberDTO [bid=" + bid + ", memid=" + memid + ", memname=" + memname + ", mempw=" + mempw + "]";
	}
	
	
}
