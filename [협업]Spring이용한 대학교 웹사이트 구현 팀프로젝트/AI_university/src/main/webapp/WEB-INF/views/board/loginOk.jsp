<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="ai.uni.dao.*" %>
<%@page import="ai.uni.dto.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AI대학교_loginOk</title>
<style>
	.ok{
		align:center;
		text-align:center;
	}
</style>
<script type="text/javascript">
	function pageChange(){
		window.opener.location.href="http://localhost:8282/main2";
		window.close();
	};
	function pageChange2(){
		window.opener.location.href="http://localhost:8282/main3";
		window.close();
	};
</script>
</head>
<body>
	<%
	request.setCharacterEncoding("UTF-8");
	//response.setContentType("text/html; charset=UTF-8");
	
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");

	MemberDAO dao = MemberDAO.getInstance();
	int checkRes = dao.userCheck(id, pw);
	//1:등록된회원이면서 암호가 맞는 경우 0:등록된회원이지만 비밀번호가 틀린경우
	//-1: 등록되지 않은 아이디 
	
	if(checkRes == -1){
		%>
		<script>alert("등록된 아이디가 없습니다.");history.go(-1);</script>
		<%
	} //-1
	else if(checkRes == 0){
		%>
		<script>alert("비밀번호가 틀립니다.");history.go(-1);</script>
		<%
	} else if(checkRes == 1){
		// 로그인된 결과를 session에 등록하는 작업 
		session.setAttribute("id", id);
		session.setAttribute("ValidMem", "yes");
	}
	%>
	<div class="ok">
		<h2><%=request.getParameter("id") %>님 반갑습니다^.^<br/></h2><h3>메인 홈페이지로 넘어가려면<br/> 아래 버튼을 눌러주세요.</h3>
		<%
			if(id.equals("admin")){
		%>
		<input type="button" value="메인homepage가기" onclick="javascript:pageChange()" style="background-color:green; color:white">
		<%	}
			else{
		%>
		<input type="button" value="메인homepage가기" onclick="javascript:pageChange2()" style="background-color:green; color:white">
		<%
			}
		%>
	</div>
</body>
</html>