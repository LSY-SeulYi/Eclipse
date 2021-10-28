<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <title>AI대학교_home</title>
        <link rel="icon" type="image/x-icon" href="resources/main/assets/favicon.ico" />
        <!-- Font Awesome icons (free version)-->
        <script src="https://use.fontawesome.com/releases/v5.15.3/js/all.js" crossorigin="anonymous"></script>
        <!-- Google fonts-->
        <link rel="preconnect" href="https://fonts.gstatic.com" />
        <link href="https://fonts.googleapis.com/css2?family=Tinos:ital,wght@0,400;0,700;1,400;1,700&amp;display=swap" rel="stylesheet" />
        <link href="https://fonts.googleapis.com/css2?family=DM+Sans:ital,wght@0,400;0,500;0,700;1,400;1,500;1,700&amp;display=swap" rel="stylesheet" />
        <!-- Core theme CSS (includes Bootstrap)-->
        <link href="resources/main/css/home_styles.css" rel="stylesheet" />
        <style>
        	#inbut{
        		width:150px;
        		height:35px;
        		background-color:transparent;
        		color:white;
        	}
			.na{
				font-size: 1.5em;
				color:white;
				outline:1px solid;
				padding:10px 10px 10px 10px;
				text-decoration:none;
			}
        </style>

    </head>
    <body>
		<!-- Background Video-->
		<video class="bg-video" playsinline="playsinline" autoplay="autoplay" muted="muted" loop="loop"><source src="resources/main/assets/mp4/bg.mp4" type="video/mp4" /></video><!-- Masthead-->
		<div class="masthead">
		    <div class="masthead-content text-white">
		        <div class="container-fluid px-4 px-lg-0">
		            <h1 class="fst-italic lh-1 mb-4">AI대학교</h1>
		            <p class="mb-5">AI대학교 메인 홈페이지에 가려면 로그인 또는 <br/> 회원가입을 해주세요.</p>
		            <a class="na" href="http://localhost:8282/login" onclick="window.open(this.href, '_blank', 'width=450px,height=550px,toolbars=no,scrollbars=no'); return false;">LOGIN</a>
		            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		            <a class="na" href="/board/join/" onclick="">JOIN</a>
		            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		            <a class="na" href="main1" onclick="">비회원</a>
		        </div>
		    </div>
		</div>         
        <!-- Social Icons-->
        <!-- For more icon options, visit https://fontawesome.com/icons?d=gallery&p=2&s=brands-->
        <div class="social-icons">
            <div class="d-flex flex-row flex-lg-column justify-content-center align-items-center h-100 mt-3 mt-lg-0">
                <a class="btn btn-dark m-3" href="#!"><i class="fab fa-twitter"></i></a>
                <a class="btn btn-dark m-3" href="#!"><i class="fab fa-facebook-f"></i></a>
                <a class="btn btn-dark m-3" href="#!"><i class="fab fa-instagram"></i></a>
            </div>
        </div>
        <!-- Bootstrap core JS-->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js"></script>
        <!-- Core theme JS-->
        <script src="resources/main/js/home_scripts.js"></script>
        <!-- * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *-->
        <!-- * *                               SB Forms JS                               * *-->
        <!-- * * Activate your form at https://startbootstrap.com/solution/contact-forms * *-->
        <!-- * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *-->
        <script src="https://cdn.startbootstrap.com/sb-forms-latest.js"></script>
    </body>
</html>

