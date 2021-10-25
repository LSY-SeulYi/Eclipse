<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<%@page import="com.vision.dto.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	BDto dto = (BDto)request.getAttribute("reply_view");
%>
	<h1 align="center">답변글 작성</h1><hr>
	<table border="5" width="500" align="center" style="border-color:pink">
		<form action="reply.do" method="post">
			<input type="hidden" name="bid" value="<%=dto.getBid()%>">
			<input type="hidden" name="bgroup" value="<%=dto.getBgroup()%>">
			<input type="hidden" name="bstep" value="<%=dto.getBstep()%>">
			<input type="hidden" name="bindent" value="<%=dto.getBindent()%>">
			<tr>
				<th>게시번호</th>
				<td><%=dto.getBid() %></td>
			</tr>
			<tr>
				<th>히트</th>
				<td><%=dto.getBhit() %></td>
			</tr>
			<tr>
				<th>게시자</th>
				<td><input type="text" name="bname" size="50"></td>
			</tr>
			<tr>
				<th>글제목</th>
				<td><input type="text" name="btitle" size="50" value="&lt;re&gt;<%=dto.getBtitle() %>"></td>
			</tr>
			<tr>
				<th>글내용</th>
				<td><textarea name="bcontent" cols="45" rows="10" value="&lt;re&gt;<%=dto.getBcontent() %>"></textarea></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
				<input type="submit" value="답변등록">&nbsp;&nbsp;&nbsp;
				<a href="list.do">목록보기</a></td>
			</tr>
		</form>
	</table>
</body>
</html>