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
	<h1>로그인</h1><hr>
	<form action="list" method="post">
		<table width="500" align="center" border="5">
			<tr>
				<th>회원아이디</th>
				<td><input type="text" name="${dto.memid}" size="50"></td>
			</tr>
			
			<tr>
				<th>회원이름</th>
				<td><input type="text" name="${dto.memname}" size="50"></td>
			</tr>
			
			<tr>
				<th>회원비밀번호</th>
				<td><input type="password" name="${dto.mempw}" size="50"></td>
			</tr>
			
			<tr>
				<td colspan="2">
					<input type="submit" value="로그인">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

				</td>
			</tr>
		</table>
	</form>
</body>
</html>