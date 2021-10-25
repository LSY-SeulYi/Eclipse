package com.vision.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vision.dao.Bdao;
import com.vision.dto.BDto;
// 리스트목록에서 선택한 상세 내용보기에 활용
public class BContentCommand implements BCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse reseponse) {
		// TODO Auto-generated method stub
		String bid = request.getParameter("bid");
		Bdao dao = new Bdao();
		BDto dto = dao.contentView(bid);
		request.setAttribute("content_view", dto);
	}

}
