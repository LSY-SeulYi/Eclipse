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
	
//	������ ���� 2���� �Ķ���͸� �����ڿ��� Ȱ��
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
