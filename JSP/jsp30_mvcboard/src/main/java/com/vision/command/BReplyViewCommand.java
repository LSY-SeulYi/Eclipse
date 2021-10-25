package com.vision.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vision.dao.Bdao;
import com.vision.dto.BDto;

public class BReplyViewCommand implements BCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse reseponse) {
		// TODO Auto-generated method stub
		String bid = request.getParameter("bid");
		Bdao dao = new Bdao();
		BDto dto = dao.reply_view(bid);
		request.setAttribute("reply_view", dto);
	}
}
