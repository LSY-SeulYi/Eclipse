package com.vision.mybatis_board.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.ui.Model;

import com.vision.mybatis_board.dto.BDto;
import com.vision.mybatis_board.mapper.BDao;

public class BReplyViewService implements IBoardService {

	private SqlSession sqlsession = Constant.sqlSession;
	
	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub

		Map<String,Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		int bid = Integer.parseInt(request.getParameter("bid"));
		BDao dao = sqlsession.getMapper(BDao.class);
		dao.upHit(bid);
		BDto dto = dao.reply_view(bid);
		model.addAttribute("reply_view", dto);
	}

}
