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
		String color_value = request.getParameter("color_value");
		out.println("색상:"+color_value+"<br/>");
	%>
</body>
</html>