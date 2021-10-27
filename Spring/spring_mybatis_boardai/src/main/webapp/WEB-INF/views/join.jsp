<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.vision.mybatis_board.dto.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">회원 가입</h1><hr>
	<form action="join_write" method="post">
		<table width="650" cellpadding="0" cellspacing="0" border="5" style="border-color:pink" align="center">
			<tr>
				<input type="hidden" name="${dto.bid}" size="70">
			</tr>
			<tr>
				<th>회원아이디</th>
				<td><input type="text" name="memid" size="70"></td>
			</tr>
			
			<tr>
				<th>회원이름</th>
				<td><input type="text" name="memname" size="70"></td>
			</tr>
			
			<tr>
				<th>회원비밀번호</th>
				<td><input type="password" name="mempw" size="70"></td>
			</tr>
			
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="회원가입">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

				</td>
			</tr>
		</table>
	</form>
</body>
</html>