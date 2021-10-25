<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.vision.beans.Person" %>
<%@ page import="java.util.Arrays" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>빈정보 출력</title>
</head>
<body>
	<h1>빈(Bean) 정보 출력</h1><hr>
	<%
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		Person p = (Person)session.getAttribute("person");
		out.println(p+"<br/>");
	%>
	<h3>
		개인정보<br/>
		이름 : <%=p.getName()%><br/>
		아이디 : <%=p.getId()%><br/>
		비밀번호 : <%=p.getPw()%><br/>
		비밀번호확인 : <%=p.getPw2()%><br/>
		이메일 : <%=p.getEmail()%><br/>
		취미 : <%=Arrays.toString(p.getHobby())%><br/>
		전공 : <%=Arrays.toString(p.getMajor())%><br/>
		프로토콜 : <%=p.getProtocol()%><br/>
		비고 : <%=p.getNote()%><br/>
	</h3>
</body>
</html>