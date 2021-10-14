<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>복수 선택 selector 결과</title>
<body>
	<%
		String[] res = request.getParameterValues("subjects");
		out.println("복수 선택 selector 결과:<p/>");
		for (String x : res) {
			out.println("&nbsp;&nbsp;&nbsp;&nbsp;" + x + "<br />");
		}
		%>
</body>
</html>