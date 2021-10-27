<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.vision.mybatis_board.dto.*" %>
<%@ page import="com.vision.mybatis_board.mapper.*" %>
<%@ page import="com.vision.mybatis_board.service.*" %>
<%@ page import="java.util.*" %>

<%
	// 페이징 처리를 위한 작업
	String pageNumberStr = request.getParameter("xpage");
	BListService service = new BListService();
	int pageNumber = 1;
	if(pageNumberStr != null){
		pageNumber = Integer.parseInt(pageNumberStr);
	}
	MessageListView viewData = service.getMessageListView(pageNumber);
	int totalPages = viewData.getPageTotalCount();
	if(pageNumberStr == null) pageNumberStr = "1";
	out.println(pageNumberStr + "/"+totalPages);
	List<BDto> subList = viewData.getMessageList();
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">회원정보</h1>
<table width="70%" cellpadding="0" cellspacing="0" border="5" align="center" style="border-color:pink" >
	<tr>
		<th>번호</th>
		<th>이름</th>
		<th>제목</th>
		<th>날짜</th>
		<th>히트</th>
	</tr>
		<!-- Model.setAttribute("list",dtos)로 서비스에서 등록한 내용을 읽어 뿌려준다. -->
		
		<c:forEach items="<%=subList %>" var="dto">
		<tr>
			<td>${dto.bid}</td>
			<td>${dto.bname}</td>
			<td>
				<c:forEach begin="1" end="${dto.bindent}">-</c:forEach>
				<a href="content_view?bId=${dto.bid}">${dto.btitle}</a></td>
			<td>${dto.bdate}</td>
			<td>${dto.bhit}</td>
		</tr>
		</c:forEach>
		<tr>
			<td colspan="5"> <a href="write_view">글작성</a> </td>
		</tr>
	</table>
	<div align="center">
	<%
		
		for (int i = 1;	i <= viewData.getPageTotalCount() ; i++) {
	 %>
		<a href="list?xpage=<%=i%>">[<%=i%>]</a>
	<%
		}
	%>
</div>

<p align="right">
	<a href="login">로그아웃</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;	
</p>
</body>
</html>