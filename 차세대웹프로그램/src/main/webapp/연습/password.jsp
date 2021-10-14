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
String strID=request.getParameter("ID");
String strPSW=request.getParameter("PSW");
	out.println("아이디 : " + strID + "<br/>");
	out.println("비밀번호 : " + strPSW + "<br/>");
%>
</body>
</html>