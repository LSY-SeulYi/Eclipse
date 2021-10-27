package com.vision.mybatis_board.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.ui.Model;

import com.vision.mybatis_board.mapper.BDao;

public class BWriteService implements IBoardService {

	private SqlSession sqlsession = Constant.sqlSession;
	
	@Override
	public void execute(Model model) { // 모델이라는 곳에 저장하여 에즈맵에 전달하여 열게된다.
		// 게시판 폼에 전달받은 정보를 데이터베이스에 등록하는 작업
		Map<String,Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request"); // get이라는 메소드를 얻어오면 어떤 것을 리턴시킬지 모르기 때문에 리퀘스트를 형변환 시키기 위해 Http... 을 앞에 형변환으로 넣어줘야 한다.
		// 리퀘스트에 정보가 담겨 있게 된다.
		// 첫글이기 때문에 세개의 파라메터만 필요하다.
		String bname = request.getParameter("bname");
		String btitle = request.getParameter("btitle");
		String bcontent = request.getParameter("bcontent");
		BDao dao = sqlsession.getMapper(BDao.class);
		dao.write(bname, btitle, bcontent);
	}

}
