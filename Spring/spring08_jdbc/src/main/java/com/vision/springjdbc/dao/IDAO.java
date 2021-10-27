package com.vision.springjdbc.dao;

import java.util.ArrayList;

import com.vision.springjdbc.dto.MemberDTO;

public interface IDAO {

	public void insert(MemberDTO dto);
	public ArrayList<MemberDTO> list();
	public void delete(String memId);
	
}
