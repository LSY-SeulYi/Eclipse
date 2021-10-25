<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="men" class="com.vision.el_ex.Member" scope="application"/>
<jsp:getProperty property="name" name="men" value="홍길동"/>
<jsp:getProperty property="id" name="men" value="HGD"/>
<jsp:getProperty property="pwd" name="men" value="1234"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	이름 : ${men.name}<br>
	아이디 : ${men.id}<br>
	비밀번호 : ${men.pwd}<br>

</body>
</html>