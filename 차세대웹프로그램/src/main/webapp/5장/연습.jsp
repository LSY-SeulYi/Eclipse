<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String a = request.getParameter("id");
String b = request.getParameter("pwd");
out.println(a+"님 안녕하세요! 반가워요!"+"<br>");
out.println("당신의 패스워드가 "+b+"이군요");
%>
</body>
</html>