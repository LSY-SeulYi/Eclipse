<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.vision.front.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>
<h1 align="center" >로그인</h1><hr>
<form action="loginOk.jsp" method="POST" align="center" >
<table border="5%" align="center" style="border-color:pink;">
	<tr><td>아이디 : <input type="text" name="id" value="<% if(session.getAttribute("id") != null) out.println(session.getAttribute("id")); %>"></td></tr><br/>
	<tr><td>패스워드 : <input type="password" name="pw"></td></tr><br/>
	<tr><td><input type="submit" value="로그인">&nbsp;&nbsp;&nbsp;&nbsp;<input type="button" value="회원가입" onclick="javascript:window.location='join.jsp'">
	</td></tr>
</table>
</form>
</body>
</html>