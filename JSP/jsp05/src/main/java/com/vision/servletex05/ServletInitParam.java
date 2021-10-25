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
// web.xml�� �����Ķ��� ����� ���� ������ �������� ����ϸ� ������ ����. �׷��� �ּ�ó�� ����� ��.
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
		
//		���ͳ� ���� �̿��ؼ� ����Ʈ ������ �̿��Ͽ� ����ϰ� �� ����Ŀ��� Ŭ���� ���ش�.
		PrintWriter out = response.getWriter();
		out.println("<html><head></head><body>");
		out.println("<h1>ȸ��� : "+company+"</h1>");
		out.println("<h1>��ȭ��ȣ : "+telephon+"</h1>");
		out.println("<h1>���̵� : "+id+"</h1>");
		out.println("<h1>�н����� : "+pw+"</h1>");
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
