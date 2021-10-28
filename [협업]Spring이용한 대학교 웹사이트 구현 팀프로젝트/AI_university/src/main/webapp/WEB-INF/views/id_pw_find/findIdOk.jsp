<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="ai.uni.dao.*" %>
<%@page import="ai.uni.dto.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AI대학교_findIdOk</title>
<style>
	.ok{
		align:center;
		text-align:center;
		border-style:solid;
		border-width:2px;
		border-color:#2F4F4F;
	}
</style>
</head>
<body>
<%
	request.setCharacterEncoding("UTF-8");

	String name = request.getParameter("name");
	String email = request.getParameter("email");
	
	MemberDAO dao = MemberDAO.getInstance();
	MemberDTO dto = new MemberDTO();

	String uni_id = dao.findId(name, email);
	
	if(uni_id==null){
		%>
		<script>alert("이름 또는 이메일이 틀립니다.");history.go(-1);</script>
		<%
	}
%>
	<div class="ok">
		<h3><%=name %>님의 아이디는<%=uni_id %>입니다.</h3>
		<hr/>
		<div><h4><a class="na" href="login">로그인하러가기</a></h4></div>
   		<div><h4>※비밀번호를 잊어버렸나요? =><a class="na" href="findPw"> 비밀번호찾기</a></h4></div>
   		<div><h4>※회원이 아니신가요? =><a class="na" href="http://localhost:8282/board/join/"> 회원가입 </a></h4></div>
	</div>
	
</body>
</html>