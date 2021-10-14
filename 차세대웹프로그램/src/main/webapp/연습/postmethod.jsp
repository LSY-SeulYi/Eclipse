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
	String strName1=request.getParameter("name1");
	String strName2=request.getParameter("name2");
	String strName3=request.getParameter("name3");
	String strName4=request.getParameter("name4");
	
	out.println("이름1 : "+strName1+"<br/>");
	out.println("이름2 : "+strName2+"<br/>");
	out.println("이름3 : "+strName3+"<br/>");
	out.println("이름4 : "+strName4+"<br/>");
%>
</body>
</html>