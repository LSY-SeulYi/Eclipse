package com.vision.mybatis_board.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.ui.Model;

import com.vision.mybatis_board.mapper.BDao;

public class BReplyService implements IBoardService {

	private SqlSession sqlsession = Constant.sqlSession;
	
	@Override
	public void execute(Model model) { // 모델이라는 곳에 저장하여 에즈맵에 전달하여 열게된다.
		// 댓글 폼에 전달받은 정보를 데이터베이스에 등록하는 작업
		Map<String,Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request"); // get이라는 메소드를 얻어오면 어떤 것을 리턴시킬지 모르기 때문에 리퀘스트를 형변환 시키기 위해 Http... 을 앞에 형변환으로 넣어줘야 한다.
		// 댓글을 등록하려면 본글의 id를 알아야 함
		int bid = Integer.parseInt(request.getParameter("bid"));
		String bname = request.getParameter("bname");
		String btitle = request.getParameter("btitle");
		String bcontent = request.getParameter("bcontent");
		// 댓글은 추가 정보가 필요 
		int bgroup = Integer.parseInt(request.getParameter("bgroup"));
		int bstep = Integer.parseInt(request.getParameter("bstep"));
		int bindent = Integer.parseInt(request.getParameter("bindent"));
				
		BDao dao = sqlsession.getMapper(BDao.class);
		dao.reply(bid,bname, btitle, bcontent,bgroup,bstep,bindent);
	
	}

}
