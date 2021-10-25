package com.vision.servletex05;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletInitParam
 */
// web.xml에 인잇파람을 등록해 놨기 때문에 이중으로 등록하면 에러가 난다. 그래서 주석처리 해줘야 함.
@WebServlet(name = "ServletInitParam", urlPatterns = { "/initparam" })
public class ServletInitParam extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletInitParam() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String id = getInitParameter("id");
		String pw = getInitParameter("pw");
		String company = getServletContext().getInitParameter("company");
		String telephon = getServletContext().getInitParameter("telephon");
		
//		인터넷 망을 이요해서 프린트 엘엔을 이용하여 사용하고 꼭 사용후에는 클로즈 해준다.
		PrintWriter out = response.getWriter();
		out.println("<html><head></head><body>");
		out.println("<h1>회사명 : "+company+"</h1>");
		out.println("<h1>전화번호 : "+telephon+"</h1>");
		out.println("<h1>아이디 : "+id+"</h1>");
		out.println("<h1>패스워드 : "+pw+"</h1>");
		out.println("</body></html>");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
