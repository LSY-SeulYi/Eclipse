<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page import="org.springframework.context.support.AbstractApplicationContext"%>
<%@ page import="org.springframework.context.support.GenericXmlApplicationContext"%>
<%@ page import="com.vision.diex.*"%>


<%
request.setCharacterEncoding("utf-8");

String location = "classpath:settings.xml";
AbstractApplicationContext container = new GenericXmlApplicationContext(location);
MyInfo myinfo = container.getBean("myinfo",MyInfo.class);
String res = myinfo.getInfo();
container.close();
%>



<html>
<head>
	<title>BMI계산기 활용</title>
</head>
<body>
<h1>
	BMI 계산 결과 
</h1>

<P>  The time on the server is ${serverTime}. </P>
<%=res %>
</body>
</html>
