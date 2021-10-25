<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.vision.daoex.*, java.sql.*, java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>다오 부리기</title>
</head>
<body>
<h1>다오 활용 결과</h1><hr>
<%
	MemberDAO dao = new MemberDAO();
	// Connection conn = DBCPFactory.getInstance();
	Connection conn = ConnFactory.getInstance();
	ArrayList<MemberDTO> data = dao.selectAll(conn);
	for (MemberDTO x:data) {
		out.println(x+"<br/>");
	}
	
%>
</body>
</html>