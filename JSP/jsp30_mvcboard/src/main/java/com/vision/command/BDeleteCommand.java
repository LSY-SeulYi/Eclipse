package com.vision.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vision.dao.Bdao;

public class BDeleteCommand implements BCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse reseponse) {
		// TODO Auto-generated method stub
		String bid = request.getParameter("bid");
		Bdao dao = new Bdao();
		dao.delete(bid);
	}
}
