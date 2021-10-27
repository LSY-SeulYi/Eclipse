package com.vision.mybatis_board;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
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

import com.vision.mybatis_board.dto.MemberDTO;
import com.vision.mybatis_board.mapper.IDao;
import com.vision.mybatis_board.service.BContentService;
import com.vision.mybatis_board.service.BListService;
import com.vision.mybatis_board.service.BModifyService;
import com.vision.mybatis_board.service.BReplyService;
import com.vision.mybatis_board.service.BReplyViewService;
import com.vision.mybatis_board.service.BWriteService;
import com.vision.mybatis_board.service.Constant;
import com.vision.mybatis_board.service.IBoardService;
import com.vision.mybatis_board.service.MemberWriteService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	IBoardService service;
	SqlSession sqlSession;
	
	@Autowired
	IDao dao;
	
	@Autowired // 이 컨트롤러 에서 sqlSession 쓸수 있게 된다.
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
		Constant.sqlSession = this.sqlSession; // 컨트롤러 자체에 세션을 설정해 놓으면 콘스탄트에서 오토와이어를 안해도 모든곳에서 세션을 쓸수 있게 된다.
	}
	
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
	
	@RequestMapping ("/list")
	public String list(Model model, HttpServletRequest request) throws SQLException, IOException {
		System.out.println("list() 실행");
		service = new BListService();
		service.execute(model);
		return "list";
	}
	
	@RequestMapping ("/write")
	public String write(Model model, HttpServletRequest request) throws SQLException, IOException {
		System.out.println("write() 실행");
		model.addAttribute("request", request);
		service = new BWriteService();
		service.execute(model);
		
		return "redirect:list";
	}
	
	@RequestMapping ("/write_view")
	public String write_view(Model model) {
		System.out.println("write_view() 실행");	
		return "write_view";
	}
	
	@RequestMapping ("/content_view")
	public String content_view(Model model, HttpServletRequest request) {
		System.out.println("content_view() 실행");
		model.addAttribute("request", request);
		service = new BContentService();
		service.execute(model);
		
		return "content_view";
	}
	
	@RequestMapping ("/modify")
	public String modify(Model model, HttpServletRequest request) {
		System.out.println("modify() 실행");
		model.addAttribute("request", request);
		service = new BModifyService();
		service.execute(model);
		
		return "redirect:list";
	}
	
	@RequestMapping ("/reply_view")
	public String reply_view(Model model, HttpServletRequest request) {
		System.out.println("reply_view() 실행");
		model.addAttribute("request", request);
		service = new BReplyViewService();
		service.execute(model);
		
		return "reply_view";
	}
	
	@RequestMapping ("/reply")
	public String reply(Model model, HttpServletRequest request) {
		System.out.println("reply() 실행");
		model.addAttribute("request", request);
		service = new BReplyService();
		service.execute(model);
		
		return "redirect:list";
	}
	
	@RequestMapping("/join")
	public String join() {
		return "join"; // writeForm.jsp 실행
	}
	
	@RequestMapping("/join_write")
	public String join_write(Model model, HttpServletRequest request) throws SQLException, IOException {
		System.out.println("insert() 실행");
		model.addAttribute("request", request);
		service = new MemberWriteService();
		service.execute(model);
		
		return "login";
	}
	
	@RequestMapping("/login")
	public String login(HttpServletRequest request) throws UnsupportedEncodingException{

		return "login";
	}
	
}
