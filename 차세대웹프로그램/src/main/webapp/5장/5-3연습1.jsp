<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>라디오버튼 선택 결과</title>
</head>
<body>
	<h2>라디오버튼 선택 결과</h2>
	<hr>
	<%
	out.println("라디오버튼 선택결과는 <br/>");
	String sex = request.getParameter("sex");
	String grade = request.getParameter("grade");
	out.println("성별:" + sex + "<br/>");
	out.println("학년:" + grade + "학년 <br/>");
	out.println("<hr/>");
	%>
</body>
</html>