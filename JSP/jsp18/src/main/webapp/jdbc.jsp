<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JDBC 4단계</title>
</head>
<body>
<h1>고객정보출력</h1>
<br/>
<%!
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String userid = "ai403";
	String userpw = "java";
	String sql = "SELECT * FROM MEMBER";
%>
<%
	try{
		Class.forName(driver); // 1단계
		conn = DriverManager.getConnection(url,userid,userpw); // 2단계
		pstmt = conn.prepareStatement(sql); // 3단계
		rs = pstmt.executeQuery();
		while(rs.next()) {
			String id = rs.getString("ID"); // 1
			String pw = rs.getString("PW"); // 2
			String name = rs.getString("NAME"); // 3
			String phone = rs.getString("PHONE"); // 4
			out.println("아이디 : "+id+", 비밀번호 : "+pw+", 이름 : "+name+", 전화번호 : "+phone+"<br/>");
		}
		conn.close(); // 4단계
	}catch(SQLException e){
		out.println("디비에 이상이 있습니다.<br/>");
	}
%>
</body>
</html>