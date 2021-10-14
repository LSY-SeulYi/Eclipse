<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>GET 방식 요청</title>
</head>
<body>
	<!-- JSP 문법 작성 -->
	<%
	out.println("이름:"+request.getParameter("user"));
	out.println("학과:"+request.getParameter("dept"));
	%>
</body>
</html>