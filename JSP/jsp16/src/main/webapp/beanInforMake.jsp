<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.vision.beans.Person" %>
<%@ page import="java.util.Arrays" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>빈 만들기</title>
</head>
<body>
	<%
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String pw2 = request.getParameter("pw2");
		String email = request.getParameter("email");
		String[] hobbys = request.getParameterValues("hobby");
		String[] majors = request.getParameterValues("major");
		String protocol = request.getParameter("protocol");
		String note = request.getParameter("note");
	%>
	<jsp:useBean id="person" class="com.vision.beans.Person" scope="page"></jsp:useBean>
	<jsp:setProperty property="name" name="person" value="<%=name %>"/> <br/>
	<jsp:setProperty property="id" name="person" value="<%=id %>"/> <br/>
	<jsp:setProperty property="pw" name="person" value="<%=pw %>"/> <br/>
	<jsp:setProperty property="pw2" name="person" value="<%=pw2 %>"/> <br/>
	<jsp:setProperty property="email" name="person" value="<%=email %>"/> <br/>
	<jsp:setProperty property="hobby" name="person" value="<%=Arrays.toString(hobbys)%>"/> <br/>
	<jsp:setProperty property="major" name="person" value="<%=Arrays.toString(majors)%>"/> <br/>
	<jsp:setProperty property="protocol" name="person" value="<%=protocol %>"/> <br/>
	<jsp:setProperty property="note" name="person" value="<%=note %>"/> <br/>
	
	<%
		session.setAttribute("person", person);
		response.sendRedirect("dispBeanInfor.jsp");
	%>
</body>
</html>