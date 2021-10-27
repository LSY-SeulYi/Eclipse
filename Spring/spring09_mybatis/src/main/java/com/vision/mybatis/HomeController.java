package com.vision.mybatis;

import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vision.mybatis.dao.IDao;
import com.vision.mybatis.dto.MemberDTO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private SqlSession sqlsession;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping("/list")
	public String list(Model model) {
//		ArrayList<MemberDTO> dtos = dao.list();
		// 다오 만들기 매퍼 (xml)를 통해 마이 바티스가 만듦
		IDao dao = sqlsession.getMapper(IDao.class);
		model.addAttribute("list", dao.list());
		return "list"; // list.jsp 실행
	}
	
	@RequestMapping("/writeForm")
	public String writeForm() {
		return "writeForm"; // writeForm.jsp 실행
	}
	
	@RequestMapping("/write")
	public String write(HttpServletRequest request) throws UnsupportedEncodingException{
		IDao dao = sqlsession.getMapper(IDao.class);
		MemberDTO dto = new MemberDTO(
			request.getParameter("memid"),
			request.getParameter("memname"),
			request.getParameter("mempw")
		);
		dao.insert(dto);
		return "redirect:list";
	}
	
	@RequestMapping("/delete")
	public String delete(HttpServletRequest request) {
		// mybatis 사용하는 맛!!
		IDao dao = sqlsession.getMapper(IDao.class);
		dao.delete(request.getParameter("memid"));
		return "delete";
	}
	
	@RequestMapping("batch")
	public String batch(HttpServletRequest request, Model model) { // model = ui를 꾸밀때 그 정보를 담아주는 객체, 자동으로 새성되는 것이기 때문에 그냥 하나 빈것을 만들어 주면 좋다
		List<MemberDTO> memList = new ArrayList<MemberDTO>();
		memList.add(new MemberDTO("user01","홍길동","1234"));
		memList.add(new MemberDTO("user02","홍길자","1234"));
		memList.add(new MemberDTO("user03","홍길순","1234"));
		memList.add(new MemberDTO("user04","성춘향","1234"));
		memList.add(new MemberDTO("user05","황진이","1234"));
		IDao dao = sqlsession.getMapper(IDao.class);
		int res = dao.batch(memList);
		String msg = "";
		if (res > 0) {
			msg = "배치처리 수행 완료";
		}else {
			msg = "배치처리 실패";
		}
		System.out.println("배치 처리 결과 : "+ msg);
		return "refirect:list";
	}
}
