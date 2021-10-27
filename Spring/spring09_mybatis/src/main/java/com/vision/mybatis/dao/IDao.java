package com.vision.mybatis.dao;

import java.util.ArrayList;
import java.util.List;

import com.vision.mybatis.dto.MemberDTO;

public interface IDao {

	public void insert(MemberDTO dto);
	public ArrayList<MemberDTO> list();
	public void delete(String meid);
	public int batch(List list); // 폴리모피즘
}
