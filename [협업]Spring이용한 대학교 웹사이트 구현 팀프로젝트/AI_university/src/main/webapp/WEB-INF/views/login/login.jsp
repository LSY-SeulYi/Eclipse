<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AI대학교_login</title>
<style>
	.cont{
		border-style:solid;
		border-width:2px;
		border-color:#2F4F4F;
		width:310px;
		height:250px;
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
<!-- Page content-->
	<div class="container-fluid" align="center">
	    <h1 class="mt-4">LOGIN</h1>
	    <div class="cont">
			<form action="loginOk" method="POST">
		    <table class="tab">
		    	<tr>
		    		<td colspan="3">id와 pw를 입력하세요.</td>
		    	</tr>
		    	<tr>
		    		<th>ID </th>
		    		<td><input type="text" name="id" placeholder="ID" required></td>
		    	</tr>
		    	<tr>
		    		<th>PW</th>
		    		<td><input type="password" name="pw" placeholder="PW" required></td>
		    	</tr>
		    	<tr>
		    		<td colspan="3"><input type="submit" value="로그인" style="width:100px; height:30px;">&nbsp;&nbsp;&nbsp;&nbsp;
		    		<input type="reset" value="취소" style="width:100px; height:30px;"></td>
		    	</tr>
	    	</table>
			</form>
	    </div><br><br>
    		<div><h4>※아이디를 잊어버렸나요? =><a class="na" href="findId"> 아이디찾기</a></h4></div>
    		<div><h4>※비밀번호를 잊어버렸나요? =><a class="na" href="findPw"> 비밀번호찾기</a></h4></div>

   	</div>
</body>
</html>