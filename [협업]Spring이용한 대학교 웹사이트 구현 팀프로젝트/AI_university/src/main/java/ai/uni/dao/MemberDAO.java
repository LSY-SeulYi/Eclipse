package ai.uni.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import ai.uni.common.*;
import ai.uni.dto.MemberDTO;

// 싱글톤 패턴으로 디자인 
public class MemberDAO {
	// 싱글톤 만들기 코딩 
	private static MemberDAO instance = new MemberDAO();
	private MemberDAO() {}// 외부에서 객체를 직접만들지 못하게 막아둠
	public static MemberDAO getInstance() {
		return instance;
	}
	// CRUD 관련 메소드 코딩
	
	// 1.유효한 아이디인지 체크
	public int confirmId(String id) {
		int res = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null; 
		String sql = "SELECT UNI_ID FROM UNI_USERS WHERE UNI_ID = ? ";
		
		try {
			conn = DBCPFactory.getInstance();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,id);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				// 사용하는 아이디가 있을 경우 안으로 들어와 작업 
				res = 1;
			}else {
				res = 0;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		}
		return res;
	}
	
	// 2.로그인정보 체크 
	public int userCheck(String id,String pw) {
		int res = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null; 
		String sql = "SELECT UNI_PW FROM UNI_USERS WHERE UNI_ID=?";	
		
		try {
			conn = DBCPFactory.getInstance();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				if(pw.equals(rs.getString("UNI_PW"))) {
					res = 1;// 비밀번호가 맞는 경우
				}else {
					res = 0;// 비밀번호가 틀린 경우
				}

			}else { // 로그인하려는 ID가 존재하지 않는 경우
				res = -1;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
		return res;
	}
	
	// 3. ID찾기 
	public String findId(String name, String email) {
		String id=null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null; 
		String sql = "SELECT UNI_ID FROM UNI_USERS WHERE UNI_NAME=? AND UNI_EMAIL=?";	
		try {
			conn = DBCPFactory.getInstance();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, email);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				id = rs.getString("UNI_ID");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		}
		return id;	
	}
	
	// 4. PW찾기
		public String findPw(String id, String name, String email) {
			String pw=null;
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null; 
			String sql = "SELECT UNI_PW FROM UNI_USERS WHERE UNI_ID=? AND UNI_NAME=? AND UNI_EMAIL=?";	
			try {
				conn = DBCPFactory.getInstance();
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, id);
				pstmt.setString(2, name);
				pstmt.setString(3, email);
				rs = pstmt.executeQuery();
				if(rs.next()) {
					pw = rs.getString("UNI_PW");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally{
				try {
					rs.close();
					pstmt.close();
					conn.close();
				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
			}
			return pw;	
		}

}
