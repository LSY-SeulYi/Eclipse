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
		String id = request.getParameter("id");
		String pw = request.getParameter("pwd");
	%>
	
	아이디 : <%= id %><br>
	비밀번호 : ${param.pwd}<br>
	비밀번호 : ${param['pwd']}<br>
	
	<%
		application.setAttribute("name", "홍길동");
		session.setAttribute("name", "홍길동");
		request.setAttribute("name", "홍길동");
		pageContext.setAttribute("name", "홍길동");
	%>
	이름 : ${param.name}<br>
	이름 : ${session.name}<br>
	이름 : ${page.name}<br>
	이름 : ${application.name}<br>
</body>
</html>