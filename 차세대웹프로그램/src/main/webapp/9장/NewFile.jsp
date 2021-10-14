<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>외부 자바스크립트 문서 작성 후 참조하기</title>
	<meta charset="utf-8"/>
	<script scr="자바스크립트 연습.js"> </script>
</head>
<body>
	<p/>
	<!-- 버튼을 클릭하면 메시지 창 출력 -->
	<button type="button" onclick="alert('외부 자바스크립트 파일')">버튼 클릭</button>
	<% out.println("Hello everybody!"); %>
	<p/>
</body>
</html>