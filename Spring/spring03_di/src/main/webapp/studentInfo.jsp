<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page import="org.springframework.context.support.AbstractApplicationContext"%>
<%@ page import="org.springframework.context.support.GenericXmlApplicationContext"%>
<%@ page import="com.vision.diex02.*"%>


<%
request.setCharacterEncoding("utf-8");

String location2 = "classpath:studentsettings.xml";
AbstractApplicationContext container2 = new GenericXmlApplicationContext(location2);
StudentInfo studentInfo = container2.getBean("studentInfo",StudentInfo.class);
StudentInfo studentInfo2 = container2.getBean("studentInfo2",StudentInfo.class);
String res = studentInfo.getStudentInfo();
String res2 = studentInfo2.getStudentInfo();
container2.close();
%>



<html>
<head>
	<title>학생 정보 출력하기</title>
</head>
<body>
<h1>
	학생 정보 출력하기 
</h1>

<%=res %><br>
<%=res2 %>
</body>
</html>
