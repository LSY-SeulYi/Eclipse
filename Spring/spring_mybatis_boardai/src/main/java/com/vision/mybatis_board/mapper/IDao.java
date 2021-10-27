package com.vision.mybatis_board.mapper;

import java.util.ArrayList;

import com.vision.mybatis_board.dto.MemberDTO;

public interface IDao {

	public MemberDTO contentView(String strmemid);
	public void insert(final String memid,final String memname,final String mempw);
	public void delete(final String memid);
}
