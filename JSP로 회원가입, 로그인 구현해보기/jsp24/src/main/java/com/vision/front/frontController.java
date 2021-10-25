package com.vision.front;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vision.common.AllMemberService;
import com.vision.common.Service;

@WebServlet("*.do")
public class frontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public frontController() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		actionDo(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		actionDo(request, response);
	}

	protected void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charSet=utf-8");
		String uri = request.getRequestURI();
		String contextPath = request.getContextPath();
//		디스패치 (배차) 작업
		String command = uri.substring(contextPath.length()); // c://sd/sd/프로젝트명/xxx.do => xxx.do만 잘라냄
		switch (command) {
		case "/insert.do":
			response.sendRedirect("join.jsp");
			break;
		case "/update.do":
			response.sendRedirect("modify.jsp");
			break;
		case "/delete.do":
			PrintWriter out1 = response.getWriter();
			out1.println(command+" : "+"정말 삭제 하실건가용~~?? 다시한번 생각해 보세요~~!!");
			break;
		case "/select.do":
			PrintWriter out2 = response.getWriter();
			out2.println(command+" : "+"한 사람 자료 선택");
			break;
		case "/selectAll.do":
			Service service = new AllMemberService();
			ArrayList<MemberDTO> dtos = service.execute(request, response);
			PrintWriter out = response.getWriter();
			out.println("<h1>우리 회원들</h1><hr>");

			for(MemberDTO x:dtos) {
				String id = x.getId();
				String pw = x.getPw();
				String name = x.getName();
				String email = x.getEmail();
				Timestamp rdate = x.getRdate();
				String address = x.getAddress();
				out.println("아이디 : "+id+"<br> 비밀번호 : "+pw+"<br> 이름 : "+name+"<br> 이메일 : "+email+"<br> 가입일 : "+rdate+"<br> 주소 : "+address);
				}
			break;
			}
		}
	}