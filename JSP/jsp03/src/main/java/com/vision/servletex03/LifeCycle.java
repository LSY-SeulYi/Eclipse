package com.vision.servletex03;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LifeCycle
 */
@WebServlet("/Life")
public class LifeCycle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LifeCycle() {        super();    }
    @PostConstruct
    public void xxxx() {
    	System.out.println("1. @PostConstruct�� ���� �޼ҵ� xxxx() ����");
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("2. init() �޼ҵ� ���� ~ !");
	}


	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("3. service() �޼ҵ� ���� ~ !");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("4. destroy() �޼ҵ� ���� ~ !");
	}
	@PreDestroy
	public void yyyy() {
		System.out.println("5. @PreDestroy�� ���� �޼ҵ� yyyy() ����");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("6. doGet() ȣ��~ !");
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("7. doPost() ȣ��~ !");
		doGet(request, response);
	}

}
