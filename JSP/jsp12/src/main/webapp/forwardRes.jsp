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
		String id, pw;
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		id = request.getParameter("id");
		pw = request.getParameter("pw");
	%>
	
	<h1>포워딩된 파라미터 값 출력</h1>
	아이디 : <%= id %> <br>
	비밀번호 : <%= pw %>
</body>
</html>