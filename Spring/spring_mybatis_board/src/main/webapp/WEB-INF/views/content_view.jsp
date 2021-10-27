<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">상세 보기</h1>
<table width="70%" cellpadding="0" cellspacing="0" border="5" style="border-color:pink" align="center">
	<form action = "modify" method = "post">
		<input type="hidden" name="bid" value="${content_view.bid}">
		<input type="hidden" name="bhit" value="${content_view.bhit}">
		<tr>
			<th>번호</th>
			<td>${content_view.bid}</td>
		</tr>
		<tr>
			<th>조회수</th>
			<td>${content_view.bhit}</td>
		</tr>
		<tr>
			<th>게시자</th>
			<td><input type="text" name="bname" size="50" value="${content_view.bname}"></td>
		</tr>
			
		<tr>
			<th>제목</th>
			<td><input type="text" name="btitle" size="50" value="${content_view.btitle}"></td>
		</tr>
			
		<tr>
			<th>내용</th>
			<td><textarea name="bcontent" rows="10" cols="50">"${content_view.bcontent}"</textarea></td>
		</tr>
			
		<tr>
			<td colspan="2">
				<input type="submit" value="수정">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<a href="list">목록보기</a>&nbsp;&nbsp;<a href="reply_view?bid=${content_view.bid}">댓글</a>
			</td>
		</tr>
	</form>
</table>
</body>
</html>