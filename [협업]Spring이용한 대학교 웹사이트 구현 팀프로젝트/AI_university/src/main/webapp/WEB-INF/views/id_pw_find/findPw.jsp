<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>비밀번호찾기</title>
<style>
	.cont{
		border-style:solid;
		border-width:2px;
		border-color:#2F4F4F;
		width:320px;
		height:280px;
		align:center;
		text-align:center;
		margin-top:auto;
		margin-bottom:auto;
		padding:10px 10px 0px 10px;
	}
	.tab{
		border-padding:10px;
		align:center;
		text-align:center;
		text-decoration:none;
	}
	th,td{
		padding:15px;
	}
	.na{
		color:black;
		text-decoration:none;
	}				
</style>
</head>
<body>
	<div class="container-fluid" align="center">
		    <h1 class="mt-4">비밀번호찾기</h1>
		    <div class="cont">
				<form action="findPwOk" method="POST">
			    <table class="tab">
			    	<tr>
			    		<td colspan="3">아이디, 이름, 이메일을 입력하세요.</td>
			    	</tr>
			    	<tr>
			    		<th>ID</th>
			    		<td><input type="text" name="id" placeholder="ID" required></td>
			    	</tr>
			    	<tr>
			    		<th>NAME</th>
			    		<td><input type="text" name="name" placeholder="NAME" required></td>
			    	</tr>
			    	<tr>
			    		<th>E-MAIL</th>
			    		<td><input type="text" name="email" placeholder="E-MAIL" required></td>
			    	</tr>
			    	<tr>
			    		<td colspan="3"><input type="submit" value="비밀번호찾기" style="width:100px; height:30px;">&nbsp;&nbsp;&nbsp;&nbsp;
			    		<input type="reset" value="취소" style="width:100px; height:30px;"></td>
			    	</tr>
			    </table>
				</form>
		    </div>
	    	<div><h4><a class="na" href="login">로그인하러가기</a></h4></div>
	   		<div><h4>※아이디를 잊어버렸나요? =><a class="na" href="findId"> 아이디찾기</a></h4></div>
	   		<div><h4>※회원이 아니신가요? =><a class="na" href="http://localhost:8282/board/join/"> 회원가입 </a></h4></div>
		</div>
</body>
</html>