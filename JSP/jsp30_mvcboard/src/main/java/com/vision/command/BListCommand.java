package com.vision.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vision.dao.Bdao;
import com.vision.dto.BDto;

public class BListCommand implements BCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse reseponse) {
		// TODO Auto-generated method stub
		Bdao dao = new Bdao();
		ArrayList<BDto> list = dao.list();
		request.setAttribute("list", list);
		
	}

}
