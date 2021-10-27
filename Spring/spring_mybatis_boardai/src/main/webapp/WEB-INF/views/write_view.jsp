<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">게시글 입력</h1>
<table width="700" cellpadding="0" cellspacing="0" border="5" style="border-color:pink" align="center">
	<form action = "write" method = "post">
		
		<tr>
			<th>게시자</th>
			<td><input type="text" name="bname" size="50"></td>
		</tr>
			
		<tr>
			<th>제목</th>
			<td><input type="text" name="btitle" size="50"></td>
		</tr>
			
		<tr>
			<th>내용</th>
			<td><textarea name="bcontent" rows="10" cols="50"></textarea></td>
		</tr>
			
		<tr>
			<td colspan="2">
				<input type="submit" value="작성">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<a href="list">목록보기</a>
			</td>
		</tr>
	</form>
</table>
</body>
</html>