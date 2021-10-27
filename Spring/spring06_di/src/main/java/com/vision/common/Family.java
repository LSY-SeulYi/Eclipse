package com.vision.common;

public class Family {

	private String papaName;
	private String mamaName;
	private String sisterName;
	private String brotorName;
	
	
	public Family() {
		super();
		// TODO Auto-generated constructor stub
	}
	
//	연습을 위해 2개의 파라미터만 생성자에서 활용
	public Family(String papaName, String mamaName) {
		super();
		this.papaName = papaName;
		this.mamaName = mamaName;
	}


	public String getPapaName() {
		return papaName;
	}
	public void setPapaName(String papaName) {
		this.papaName = papaName;
	}
	public String getMamaName() {
		return mamaName;
	}
	public void setMamaName(String mamaName) {
		this.mamaName = mamaName;
	}
	public String getSisterName() {
		return sisterName;
	}
	public void setSisterName(String sisterName) {
		this.sisterName = sisterName;
	}
	public String getBrotorName() {
		return brotorName;
	}
	public void setBrotorName(String brotorName) {
		this.brotorName = brotorName;
	}
	
	
}
