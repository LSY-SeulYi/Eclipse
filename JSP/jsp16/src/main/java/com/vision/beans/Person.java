package com.vision.beans;

import java.util.Arrays;

// 이름, 아이디, 비밀번호, 비밀번호확인, 이메일, 취미, 전공, 프로토콜, 비고
public class Person {

	private String name;
	private String id;
	private String pw;
	private String pw2;
	private String email;
	private String[] hobby;
	private String[] major;
	private String protocol;
	private String note;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String name, String id, String pw, String pw2, String email, String[] hobby, String[] major,
			String protocol, String note) {
		super();
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.pw2 = pw2;
		this.email = email;
		this.hobby = hobby;
		this.major = major;
		this.protocol = protocol;
		this.note = note;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getPw2() {
		return pw2;
	}

	public void setPw2(String pw2) {
		this.pw2 = pw2;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String[] getHobby() {
		return hobby;
	}

	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}

	public String[] getMajor() {
		return major;
	}

	public void setMajor(String[] major) {
		this.major = major;
	}

	public String getProtocol() {
		return protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
	
	
}
