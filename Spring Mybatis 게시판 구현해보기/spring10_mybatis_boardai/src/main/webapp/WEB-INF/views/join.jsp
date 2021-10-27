<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>회원가입</h1><hr>
	<form action="join_write" method="post">
		<table width="500" align="center" border="5">
			<tr>
				<th>회원아이디</th>
				<td><input type="text" name="memid" size="50"></td>
			</tr>
			
			<tr>
				<th>회원이름</th>
				<td><input type="text" name="memname" size="50"></td>
			</tr>
			
			<tr>
				<th>회원비밀번호</th>
				<td><input type="password" name="mempw" size="50"></td>
			</tr>
			
			<tr>
				<td colspan="2">
					<input type="submit" value="회원가입">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					<a href="login">로그인</a>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>