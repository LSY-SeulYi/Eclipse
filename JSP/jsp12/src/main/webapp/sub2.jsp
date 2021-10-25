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
		String name, age;
		name = request.getParameter("name");
		age = request.getParameter("age");
	%>
	<h1>나는 서브 2 입니다.</h1>
	이름 : <%=name %> <br>
	나이 : <%=age %> <br>
</body>
</html>