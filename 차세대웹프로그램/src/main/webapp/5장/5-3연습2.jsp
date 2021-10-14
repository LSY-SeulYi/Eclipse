<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>체크박스에서 넘어온 파라미터 처리</title>
</head>
<body>
	<h2>체크박스 선택결과</h2>
	<hr>
	<%
	out.println("체크박스 선택결과는 <br/>");
	String[] subjects = request.getParameterValues("subject");
	for(String x : subjects) {out.println("관심주제:" + x + "<br/>");}
	out.println("<hr/>");
	%>
</body>
</html>