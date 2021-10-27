<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>댓글달기</h1><hr>
<table width="700" cellpadding="0" cellspacing="0" border="5" style="border-color:pink" align="center">
	<form action="reply" method="post">
		<input type="hidden" name="bid" value="${reply_view.bid}">
		<input type="hidden" name="bgroup" value="${reply_view.bgroup}">
		<input type="hidden" name="bstep" value="${reply_view.bstep}">
		<input type="hidden" name="bindent" value="${reply_view.bindent}">
		
		<tr>
			<th>번호</th>
			<td>${reply_view.bid}</td>
		</tr>
		
		<tr>
			<th>조회수</th>
			<td>${reply_view.bhit}</td>
		</tr>
	
		<tr>
			<th>게시자</th>
			<td><input type="text" name="bname" size="50" ></td>
		</tr>
		<tr>
			<th>제목</th>
			<td><input type="text" name="btitle" size="50" value="&lt;re&gt; ${reply_view.btitle }"></td>
		</tr>
		<tr>
			<th>내용</th>
			<td><textarea  name="bcontent" rows="10" cols="47">&lt;re&gt;${reply_view.bcontent}</textarea></td>
		</tr>
		<tr>
			<td colspan="2">
			<input type="submit" value="댓글"><a href="list">목록가기</a>
		</tr>
	
	</form>
</table>

</body>
</html>