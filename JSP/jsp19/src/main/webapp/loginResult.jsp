<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>로그인<br> 환영합니다~</h1>
	<%
		String name = (String)session.getAttribute("name");
		String phone = (String)session.getAttribute("phone");
		String id = (String)session.getAttribute("id");
		String pw = (String)session.getAttribute("pw");
	%>
	<h2><%=name%>님 안녕하세요~! 환영합니다~!</h2>
	<h2>당신의 전화번호는 <%=phone%>이군요~! 틀리면 수정하세요~!</h2>
	<a href="modify.jsp">회원정보수정</a>
</body>
</html>