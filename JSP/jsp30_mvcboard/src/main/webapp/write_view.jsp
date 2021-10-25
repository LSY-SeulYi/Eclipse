<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">게시글 작성</h1><hr>
	<table border="5" width="500" align="center" style="border-color:pink">
		<form action="write.do" method="post">
			<tr>
				<th>게시자</th>
				<td><input type="text" name="bname" size="50"></td>
			</tr>
			<tr>
				<th>글제목</th>
				<td><input type="text" name="btitle" size="50"></td>
			</tr>
			<tr>
				<th>글내용</th>
				<td><textarea name="bcontent" cols="45" rows="10"></textarea></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
				<input type="submit" value="글등록">&nbsp;&nbsp;&nbsp;
				<a href="list.do">목록보기</a></td>
			</tr>
		</form>
	</table>
</body>
</html>