package com.vision.mybatis_board.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.ui.Model;

import com.vision.mybatis_board.mapper.IDao;

public class MemberWriteService implements IBoardService {

	private SqlSession sqlsession = Constant.sqlSession;
	
	@Override
	public void execute(Model model) {

		Map<String,Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request"); // get이라는 메소드를 얻어오면 어떤 것을 리턴시킬지 모르기 때문에 리퀘스트를 형변환 시키기 위해 Http... 을 앞에 형변환으로 넣어줘야 한다.
		// 리퀘스트에 정보가 담겨 있게 된다.
		// 첫글이기 때문에 세개의 파라메터만 필요하다.
		String memid = request.getParameter("memid");
		String memname = request.getParameter("memname");
		String mempw = request.getParameter("mempw");
		IDao dao = sqlsession.getMapper(IDao.class);
		dao.insert(memid, memname, mempw);

	}

}
