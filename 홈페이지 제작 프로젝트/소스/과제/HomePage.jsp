<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>고양이 쇼핑몰</title>
</head>
<body>
	<center>
		<table border="1" width="800">
		<tr height="150">
			<td align="center" colspan="2"><jsp:include page="Top.html" /></td>
		</tr>
		<tr height="400">
			<td align="center" width="200"><jsp:include page="Left.jsp" /></td>
			<td align="center" width="200"><jsp:include page="Center.html" /></td>
		</tr>
		<tr height="100">
			<td align="center" colspan="2"><jsp:include page="Bottom.jsp" /></td>
		</tr>
		</table>
	</center>
</body>
</html>
