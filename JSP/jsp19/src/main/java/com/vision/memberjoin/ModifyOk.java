package com.vision.memberjoin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.sql.*;
/**
 * ����ȭ�鿡�� �Ѿ�� �Ķ���� ������ ��� ������Ʈ �ϴ� �۾�
 */
@WebServlet("/ModifyOk")
public class ModifyOk extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String user = "ai403";
	private String pwd = "java";
	private String name,id,pw,phone;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModifyOk() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		actionDo(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		actionDo(request,response);
	}

	private void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=utf-8");
		name = request.getParameter("name");
		id = request.getParameter("id");
		pw = request.getParameter("pw");
		phone = request.getParameter("phone");
		
		try {
			String sql = "UPDATE MEMBER SET NAME =?, PW =?, PHONE =? WHERE ID =?";
			conn = DriverManager.getConnection(url,user,pwd);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, pw);
			pstmt.setString(3, phone);
			pstmt.setString(4, id);
			
			HttpSession session = request.getSession();
			int i = pstmt.executeUpdate();
			if(1==i) {
				session.setAttribute("name", name);
				session.setAttribute("pw", pw);
				session.setAttribute("phone", phone);
				
				System.out.println("Update Success~!!");
				response.sendRedirect("modifyResult.jsp");
			}else {
				System.out.println("Update Failure~!!");
				response.sendRedirect("modify.jsp");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally { //���ܹ߻� ������ ������� �����ؾ� �� �κ�
			try {
				if(pstmt != null && pstmt.isClosed())
					pstmt.close();
				if(conn != null && conn.isClosed())
					conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
