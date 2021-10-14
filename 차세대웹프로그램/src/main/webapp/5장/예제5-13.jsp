<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>날짜출력</title>
</head>
<body>
	<%
		String today = request.getParameter("today");
		String from = request.getParameter("from");
		String to = request.getParameter("to");
		out.println("오늘:"+today+"<br/>");
		out.println("시작:"+from+"<br/>");
		out.println("종료:"+to+"<br/>");
	 %>
</body>
</html>