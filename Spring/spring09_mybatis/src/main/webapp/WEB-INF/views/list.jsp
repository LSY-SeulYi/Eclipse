<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보출력</title>
</head>
<body>
<h1>회원정보</h1>
<table width="700" border="5">
	<tr>
		<th>회원id</th>
		<th>회원이름</th>
		<th>회원암호</th>
		<th>삭제</th>
	</tr>
	<c:forEach items="${list}" var="dto">
	<tr>
		<td>${dto.memid}</td>
		<td>${dto.memname}</td>
		<td>${dto.mempw}</td>
		<td><a href="delete?memid=${dto.memid}">X</a></td>
	</tr>
	</c:forEach>
	
</table>

</body>
</html>