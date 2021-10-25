package com.vision.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vision.dao.Bdao;
import com.vision.dto.BDto;

public class BModifyCommand implements BCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse reseponse) {
		// TODO Auto-generated method stub
		String bid = request.getParameter("bid");
		String bname = request.getParameter("bname");
		String btitle = request.getParameter("btitle");
		String bcontent = request.getParameter("bcontent");
		Bdao dao = new Bdao();
		dao.modify(bid, bname, btitle, bcontent);
	}
}
