<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.vision.invalid.*"%>
<%
	request.setCharacterEncoding("utf-8");
	response.setContentType("text/html; charset=utf-8");
	String id = (String)session.getAttribute("id");
	MemberDAO dao = MemberDAO.getInstance();
	MemberDTO dto = dao.getMember(id);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<script languege="JavaScript" src="members.js"></script>
<form action="modifyOk.jsp" method="post" name="reg_frm" align="center">
	<table border="5%" align="center">
		<tr><td>아이디</td><td><%=dto.getId() %></td></tr>
		<tr><td>비밀번호</td><td><input type="password" name="pw" size="20"/></td></tr>
		<tr><td>비밀번호확인</td><td><input type="password" name="pw_check" size="20"/></td></tr>
		<tr><td>이름</td><td><input type="text" name="name" size="20" value="<%=dto.getName() %>"/></td></tr>
		<tr><td>전화번호</td><td><input type="text" name="phone" size="20" value="<%=dto.getPhone() %>"/></td></tr>
		<tr><td colspan="2" align="center"><input type="button" value="정보수정" onclick="updateInfoConfirm()"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<input type="reset" value="취 소" onclick="javaScript:window.location='login.jsp'"/></td></tr>
	</table>
</form>
</body>
</html>