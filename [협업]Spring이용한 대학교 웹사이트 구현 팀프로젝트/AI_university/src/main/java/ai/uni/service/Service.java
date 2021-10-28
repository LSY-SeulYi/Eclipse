package ai.uni.service;

import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ai.uni.dto.MemberDTO;

public interface Service {
	public ArrayList<MemberDTO> 
	execute(HttpServletRequest request,HttpServletResponse response);
}
