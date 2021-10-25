package com.vision.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;

import com.vision.common.DBCPFactory;
import com.vision.dto.BDto;

public class Bdao {
//  게시글 등록
//	게시글 목록
//	게시글 상세뷰
//	게시글 수정(자신의 것만)
//	게시글 삭제(자신의 것만)
//	게시글 안에 댓글 달기
//	게시글 안에 댓글 보기
//	게시글 안에 댓글 정리(리쉐이프)
//	게시글 조회수 증가(히트수)
	
//  처음 게시글 등록
	public void write(String bname, String btitle, String bcontent) {
		Connection conn = DBCPFactory.getInstance();
		PreparedStatement pstmt = null;
		// 히트수와 등록일자는 자동으로 들어감 (디비 설계시 디폴트 값으로 0과 sysdata를 줌)
		String sql = "INSERT INTO MVC_BOARD (BID,BNAME,BTITLE,BCONTENT,BGROUP,BSTEP,BINDENT) VALUES (MVC_BOARD_SEQ.NEXTVAL,?,?,?,MVC_BOARD_SEQ.CURRVAL,0,0)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bname);
			pstmt.setString(2, btitle);
			pstmt.setString(3, bcontent);
			int res = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null && !pstmt.isClosed()) pstmt.close();
				if(conn != null && !conn.isClosed()) conn.close();
			} catch (SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		}
	}
//	게시글 목록
	public ArrayList<BDto> list(){
		ArrayList<BDto> list = new ArrayList();
		Connection conn = DBCPFactory.getInstance();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		// 웹페이지에 게시되는 순서를 고려 (최근거부터 나올지 과거부터 나올지) -> 본글은 내림차순, 게시글은 오름차순으로 정렬
		String sql = "SELECT * FROM MVC_BOARD ORDER BY BGROUP DESC,BSTEP ASC";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int bid = rs.getInt("BID");
				String bname = rs.getString("BNAME");
				String btitle = rs.getString("BTITLE");
				String bcontent = rs.getString("BCONTENT");
				Timestamp bdate = rs.getTimestamp("BDATE");
				int bhit = rs.getInt("BHIT");
				int bgroup = rs.getInt("BGROUP");
				int bstep = rs.getInt("BSTEP");
				int bindent = rs.getInt("BINDENT");
				// 점검이나 걸러내야하는 것을 할때는 아래의 로직을 사용할 수 없다. 그럴때는 세터를 통해서 사용
				BDto dto = new BDto(bid,bname,btitle,bcontent,bdate,bhit,bgroup,bstep,bindent);
				list.add(dto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(rs != null && !rs.isClosed()) rs.close();
				if(pstmt != null && !pstmt.isClosed()) pstmt.close();
				if(conn != null && !conn.isClosed()) conn.close();
			} catch (SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		}
		return list;
	}
	
//	게시글 상세뷰
	public BDto contentView(String strId) {
	// 조회수를 증가하기
		upHit(strId);
		BDto dto = null;
		Connection conn = DBCPFactory.getInstance();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM MVC_BOARD WHERE BID = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, strId);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				int bid = rs.getInt("BID");
				String bname = rs.getString("BNAME");
				String btitle = rs.getString("BTITLE");
				String bcontent = rs.getString("BCONTENT");
				Timestamp bdate = rs.getTimestamp("BDATE");
				int bhit = rs.getInt("BHIT");
				int bgroup = rs.getInt("BGROUP");
				int bstep = rs.getInt("BSTEP");
				int bindent = rs.getInt("BINDENT");
				dto = new BDto(bid,bname,btitle,bcontent,bdate,bhit,bgroup,bstep,bindent);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(rs != null && !rs.isClosed()) rs.close();
				if(pstmt != null && !pstmt.isClosed()) pstmt.close();
				if(conn != null && !conn.isClosed()) conn.close();
			} catch (SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		}
		return dto;
	}
	// 조회수 증가
	private void upHit(String strId) {
		Connection conn = DBCPFactory.getInstance();
		PreparedStatement pstmt = null;
		// 히트수와 등록일자는 자동으로 들어감 (디비 설계시 디폴트 값으로 0과 sysdata를 줌)
		String sql = "UPDATE MVC_BOARD SET BHIT = BHIT+1 WHERE BID = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, strId);
			int res = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null && !pstmt.isClosed()) pstmt.close();
				if(conn != null && !conn.isClosed()) conn.close();
			} catch (SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		}
	}
	
//	게시글 수정(자신의 것만)
	public void modify(String bid, String bname, String btitle, String bcontent) {
		Connection conn = DBCPFactory.getInstance();
		PreparedStatement pstmt = null;
		String sql = "UPDATE MVC_BOARD SET BNAME =?, BTITLE =?, BCONTENT =? WHERE BID = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bname);
			pstmt.setString(2, btitle);
			pstmt.setString(3, bcontent);
			pstmt.setString(4, bid);
			int res = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null && !pstmt.isClosed()) pstmt.close();
				if(conn != null && !conn.isClosed()) conn.close();
			} catch (SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		}
	}
	
//	게시글 삭제(자신의 것만)
	public void delete(String bid) {
		Connection conn = DBCPFactory.getInstance();
		PreparedStatement pstmt = null;
		String sql = "DELETE FROM MVC_BOARD WHERE BID = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bid);
			int res = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null && !pstmt.isClosed()) pstmt.close();
				if(conn != null && !conn.isClosed()) conn.close();
			} catch (SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		}
	}
	
//	게시글 안에 댓글 달기 (본글과 댓글등록은 차이가 있다 - 조회수와 댓글 날짜는 자동으로 들어감)
	public void reply(String bid, String bname, String btitle, String bcontent, String bgroup, String bstep, String bindent) {
		// 이 댓글과 같은 그룹의 댓글중에서 bstep이 이 댓글의 bstep보다 큰 놈들은 1씩 증가시켜 놓는다. 그래야 이 댓글을 제일 앞에 나오게 됨.
		replyShape(bgroup,bstep);
		Connection conn = DBCPFactory.getInstance();
		PreparedStatement pstmt = null;
		String sql = "INSERT INTO MVC_BOARD (BID,BNAME,BTITLE,BCONTENT,BGROUP,BSTEP,BINDENT) VALUES (MVC_BOARD_SEQ.NEXTVAL,?,?,?,?,?,?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bname);
			pstmt.setString(2, btitle);
			pstmt.setString(3, bcontent);
			pstmt.setInt(4, Integer.parseInt(bgroup));
			pstmt.setInt(5, Integer.parseInt(bstep)+1);
			pstmt.setInt(6, Integer.parseInt(bindent)+1);
			int res = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null && !pstmt.isClosed()) pstmt.close();
				if(conn != null && !conn.isClosed()) conn.close();
			} catch (SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		}
	}
	
//	게시글 안에 댓글 보기
	public BDto reply_view(String strId) {
		upHit(strId);
		BDto dto = null;
		Connection conn = DBCPFactory.getInstance();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM MVC_BOARD WHERE BID = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, strId);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				int bid = rs.getInt("BID");
				String bname = rs.getString("BNAME");
				String btitle = rs.getString("BTITLE");
				String bcontent = rs.getString("BCONTENT");
				Timestamp bdate = rs.getTimestamp("BDATE");
				int bhit = rs.getInt("BHIT");
				int bgroup = rs.getInt("BGROUP");
				int bstep = rs.getInt("BSTEP");
				int bindent = rs.getInt("BINDENT");
				dto = new BDto(bid,bname,btitle,bcontent,bdate,bhit,bgroup,bstep,bindent);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(rs != null && !rs.isClosed()) rs.close();
				if(pstmt != null && !pstmt.isClosed()) pstmt.close();
				if(conn != null && !conn.isClosed()) conn.close();
			} catch (SQLException e2) {
				// TODO Auto-generated catch block
					e2.printStackTrace();
				}
			}
			return dto;
		}
	
//	게시글 안에 댓글 정리(리쉐이프)
	private void replyShape(String bgroup, String bstep) {
		Connection conn = DBCPFactory.getInstance();
		PreparedStatement pstmt = null;
		String sql = "UPDATE MVC_BOARD SET BSTEP = BSTEP+1 WHERE BGROUP = ? AND BSTEP > ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(bgroup));
			pstmt.setInt(2, Integer.parseInt(bstep));
			int res = pstmt.executeUpdate();
		} catch (NumberFormatException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null && !pstmt.isClosed()) pstmt.close();
				if(conn != null && !conn.isClosed()) conn.close();
			} catch (SQLException e2) {
				// TODO Auto-generated catch block
					e2.printStackTrace();
				}
			}
		}
}
