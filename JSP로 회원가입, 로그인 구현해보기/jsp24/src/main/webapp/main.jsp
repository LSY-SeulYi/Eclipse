<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
	response.setContentType("text/html; charset=UTF-8");
	//if(!session.getAttribute("ValidMen").equals("yes")){
	if(session.getAttribute("ValidMen")==null){
		%>
		<jsp:forward page="login.jsp"></jsp:forward>
		<%
	}
	String name = (String)session.getAttribute("name");
	String id = (String)session.getAttribute("id");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인화면</title>
</head>
<body>
<h1 align="center">메인화면</h1><hr>
<h2 align="center"><%=name %>님 안녕하세요. 반갑습니다~!</h2>
<form action="logOut.jsp" method="post" align="center">
	<input type="submit" value="로그아웃"> &nbsp;&nbsp;&nbsp;&nbsp; 
	<input type="button" value="정보수정" onclick="javascript:window.location='modify.jsp'">
</form>

</body>
</html>