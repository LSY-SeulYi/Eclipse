<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 빈 사용을 위한 선언 -->
<jsp:useBean id = "student" class="com.vision.beans.Student" scope="page"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>빈(Bean) 정보 출력</title>
</head>
<body>
	<!-- Student student = new Student("홍길동", "19", ...) -->
	<jsp:setProperty property="name" name="student" value="홍길동"/>
	<jsp:setProperty property="age" name="student" value="23"/>
	<jsp:setProperty property="grade" name="student" value="3학년"/>
	<jsp:setProperty property="studentNum" name="student" value="19"/>
	<h2>
	<%
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		out.println(student);
	%>
	</h2>
	<hr>
	이름 : <jsp:getProperty property="name" name="student"/> <br/>
	나이 : <jsp:getProperty property="age" name="student"/> <br/>
	학년 : <jsp:getProperty property="grade" name="student"/> <br/>
	학번 : <jsp:getProperty property="studentNum" name="student"/> <br/>
</body>
</html>