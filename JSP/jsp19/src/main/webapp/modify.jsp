<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수정작업</title>
</head>
<body>
<%!
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String user = "ai403";
	private String pwd = "java";
	private String name,id,pw,phone;
%>
<%
	id = (String)session.getAttribute("id");
	String sql = "SELECT * FROM MEMBER WHERE ID = ?";
	/* 1단계 */
	Class.forName(driver);
	conn = DriverManager.getConnection(url,user,pwd);
	pstmt = conn.prepareStatement(sql);
	pstmt.setString(1, id);
	rs = pstmt.executeQuery();
	
	while(rs.next()) {
		name = rs.getString("NAME");
		id = rs.getString("ID");
		pw = rs.getString("PW");
		phone = rs.getString("PHONE");
	}
%>
<form action="ModifyOk" method = "POST">
	<table border="5%" align="center">
		<tr><td>이름</td><td><input type="text" name="name" size="10" value=<%=name%>/></td></tr>
		<tr><td>아이디</td><td><input type="text" name="id" size="10" value=<%=id%>/></td></tr>
		<tr><td>비밀번호</td><td><input type="text" name="pw" size="10" value=<%=pw%>/></td></tr>
		<tr><td>전화번호</td><td><input type="text" name="phone" size="15" value=<%=phone%>/></td></tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" value="정보수정">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<input type="reset" value="취소">
			</td>
		</tr>
	</table>
</form>
</body>
</html>