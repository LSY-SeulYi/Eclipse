<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.vision.dto.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글보기</title>
</head>
<body>
<%
	BDto dto = (BDto)request.getAttribute("content_view");
%>
<h1 align="center">게시글 보기</h1><hr>
<table border="5" width="500" align="center" style="border-color:pink">
	<form action="modify.do" method="post">
		<input type="hidden" name="bid" value="<%=dto.getBid()%>">
		<input type="hidden" name="bname" value="<%=dto.getBname()%>">
		<input type="hidden" name="bhit" value="<%=dto.getBhit()%>">
		<tr>
			<th>번호</th>
			<td><%=dto.getBid() %></td>
		</tr>
		<tr>
			<th>히트</th>
			<td><%=dto.getBhit()%></td>
		</tr>
		<tr>
			<th>게시자</th>
			<td><%=dto.getBname() %></td>
		</tr>
		<tr>
			<th>제목</th>
			<td><input size="50" type="text" name="btitle" value="<%=dto.getBtitle() %>"></td>
		</tr>
		<tr>
			<th>내용</th>
			<td><textarea cols="53" rows="10" name="bcontent"><%=dto.getBcontent() %></textarea></td>
		</tr>
		<tr>
			<td colspan="2">
			<input type="submit" value="글수정">&nbsp;&nbsp;&nbsp;
			<a href="list.do?bid">목록보기</a>&nbsp;&nbsp;&nbsp;
			<a href="delete.do?bid=<%=dto.getBid()%>">삭제</a>&nbsp;&nbsp;&nbsp;
			<a href="reply_view.do?bid=<%=dto.getBid()%>">답변</a>
			</td>
		</tr>
	</form>
</table>
</body>
</html>