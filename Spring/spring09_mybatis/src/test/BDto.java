package com.vision.mybatis_board.dto;

import java.sql.Timestamp;

public class BDto {

	private int bid; // 게시글 고유번호(자동으로 생성)
	private String bname; // 게시자 아이디 혹은 이름( 포린키 변환 대상)
	private String btitle; // 게시글제목
	private String bcontent; // 게시물 내용
	private Timestamp bdate; // 게시일자 : 자동으로 입력
	private int bhit; // 히트수(조회수) 글이 읽힐때마다 1씩 증가 시켜 업데이트 하는 부분
	private int bgroup; // 본들의 bid
	private int bstep; // 댓글의 게시 순서
	private int bindent; // 댓글의 들여쓰기
	
	public BDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public BDto(int bid, String bname, String btitle, String bcontent, Timestamp bdate, int bhit, int bgroup, int bstep,
			int bindent) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.btitle = btitle;
		this.bcontent = bcontent;
		this.bdate = bdate;
		this.bhit = bhit;
		this.bgroup = bgroup;
		this.bstep = bstep;
		this.bindent = bindent;
	}
	
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getBtitle() {
		return btitle;
	}
	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}
	public String getBcontent() {
		return bcontent;
	}
	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}
	public Timestamp getBdate() {
		return bdate;
	}
	public void setBdate(Timestamp bdate) {
		this.bdate = bdate;
	}
	public int getBhit() {
		return bhit;
	}
	public void setBhit(int bhit) {
		this.bhit = bhit;
	}
	public int getBgroup() {
		return bgroup;
	}
	public void setBgroup(int bgroup) {
		this.bgroup = bgroup;
	}
	public int getBstep() {
		return bstep;
	}
	public void setBstep(int bstep) {
		this.bstep = bstep;
	}
	public int getBindent() {
		return bindent;
	}
	public void setBindent(int bindent) {
		this.bindent = bindent;
	}
	
	
}
