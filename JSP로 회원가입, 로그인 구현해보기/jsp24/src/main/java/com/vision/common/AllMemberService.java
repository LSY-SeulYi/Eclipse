package com.vision.common;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vision.front.MemberDAO;
import com.vision.front.MemberDTO;

public class AllMemberService implements Service {
	
	@Override
	public ArrayList<MemberDTO> execute(HttpServletRequest request,HttpServletResponse response){
		MemberDAO dao = MemberDAO.getInstance();
		return dao.selectAll();
	}

}
