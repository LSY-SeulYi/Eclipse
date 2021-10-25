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
//		����ġ (����) �۾�
		String command = uri.substring(contextPath.length()); // c://sd/sd/������Ʈ��/xxx.do => xxx.do�� �߶�
		switch (command) {
		case "/insert.do":
			response.sendRedirect("join.jsp");
			break;
		case "/update.do":
			response.sendRedirect("modify.jsp");
			break;
		case "/delete.do":
			PrintWriter out1 = response.getWriter();
			out1.println(command+" : "+"���� ���� �Ͻǰǰ���~~?? �ٽ��ѹ� ������ ������~~!!");
			break;
		case "/select.do":
			PrintWriter out2 = response.getWriter();
			out2.println(command+" : "+"�� ��� �ڷ� ����");
			break;
		case "/selectAll.do":
			Service service = new AllMemberService();
			ArrayList<MemberDTO> dtos = service.execute(request, response);
			PrintWriter out = response.getWriter();
			out.println("<h1>�츮 ȸ����</h1><hr>");

			for(MemberDTO x:dtos) {
				String id = x.getId();
				String pw = x.getPw();
				String name = x.getName();
				String email = x.getEmail();
				Timestamp rdate = x.getRdate();
				String address = x.getAddress();
				out.println("���̵� : "+id+"<br> ��й�ȣ : "+pw+"<br> �̸� : "+name+"<br> �̸��� : "+email+"<br> ������ : "+rdate+"<br> �ּ� : "+address);
				}
			break;
			}
		}
	}