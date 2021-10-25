<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>이곳은 성인 사이트 입니다. <br><br> 당신은 <%=request.getParameter("age") %>세, 미성년자로 접근이 제한되었습니다.</h1>
</body>
</html>