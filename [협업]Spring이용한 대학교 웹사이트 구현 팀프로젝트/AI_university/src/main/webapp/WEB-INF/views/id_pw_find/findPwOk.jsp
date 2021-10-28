<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="ai.uni.dao.*" %>
<%@page import="ai.uni.dto.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AI대학교_findPwOk</title>
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
	
	String id = request.getParameter("id");
	String name = request.getParameter("name");
	String email = request.getParameter("email");
	
	MemberDAO dao = MemberDAO.getInstance();
	MemberDTO dto = new MemberDTO();

	String uni_pw = dao.findPw(id, name, email);
	
	if(uni_pw==null){
		%>
		<script>alert("아이디 또는 이름 또는 이메일을 확인해주세요.");history.go(-1);</script>
		<%
	}
%>
	<div class="ok">
		<h3><%=id %>님의 비밀번호는<%=uni_pw %>입니다.</h3>
		<hr/>
		<div><h4><a class="na" href="login">로그인하러가기</a></h4></div>
   		<div><h4>※아이디를 잊어버렸나요? =><a class="na" href="findId"> 아이디찾기</a></h4></div>
   		<div><h4>※회원이 아니신가요? =><a class="na" href="http://localhost:8282/board/join/"> 회원가입 </a></h4></div>
	</div>	
	
</body>
</html>