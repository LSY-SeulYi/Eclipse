package com.vision.common;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vision.front.MemberDTO;

public interface Service {
	public ArrayList<MemberDTO> execute(HttpServletRequest request,HttpServletResponse response);
	
}
