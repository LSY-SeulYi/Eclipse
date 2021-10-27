package com.vision.mybatis_board.dao;

import java.util.ArrayList;

import com.vision.mybatis_board.dto.MemberDTO;

public interface IDao {

	public void insert(MemberDTO dto);
	public ArrayList<MemberDTO> list();
	public void delete(String memId);
}
