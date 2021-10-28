<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AI 대학교 공과대학</title>
<link href="resources/css/styles2.css" rel="stylesheet" />
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<style>
.basic_box {
    background: #f6f7f9;
    border: 1px solid #ddd;
    border-top-color: #003876;
    padding: 20px;
}

.basic_box2 {
    background: #f6f7f9;
    border: 1px solid #ddd;
    padding: 20px;
}

.footer{
	background-color:#2F4F4F;
	height : 110px;
}
.foot2{
	padding-top:1rem;
	padding-bottom:1rem;
	background-color:#323232;
	color:#bebebe;
	width: 100%;
	height: 40px;
	text-align:center;
	align:center;
}
      
.na2{
	color:white;
    text-decoration:none;
}

.nav{
	background-color:#2F4F4F;
}
</style>
</head>
<body>

	<nav class="nav navbar navbar-expand-lg navbar-dark fixed-top">
	<span class="navbar-brand mx-5 mb-0 font-weight-bold font-italic"><a class="text-white" href="http://localhost:8282/main1">AI 대학교</a>&nbsp;&nbsp;&nbsp;
	<a class="text-white" href="http://localhost:8282/AI_university_gong/main">공과대학</a></span>
	<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent">
	    <span class="navbar-toggler-icon"></span>
	</button>
	
	    <div class="collapse navbar-collapse" id="navbarSupportedContent">
	    <!--
	        <ul class="navbar-nav mr-auto">
	
	            <li class="nav-item dropdown mx-1 btn btn-primary">
	                <a class="nav-link dropdown-toggle text-white" href="#" data-toggle="dropdown">1번</a>
	                <div class="dropdown-menu">
	                    <a class="dropdown-item" href="{% url 'bookmark:add' %}">Add1</a>
	                    <a class="dropdown-item" href="{% url 'blog:add' %}">Add2</a>
	                    <div class="dropdown-divider"></div>
	                    <a class="dropdown-item" href="{% url 'photo:album_add' %}">Add3</a>
	                    <a class="dropdown-item" href="{% url 'photo:photo_add' %}">Add4</a>
	                </div>
	            </li>
	        </ul>
	    -->
	    </div>
	</nav>
<br><br><br>

	<h2 class="text-center">연구 분야</h2>

		<section class="py-1">
            <div class="container my-1">
                <div class="row justify-content-center">
                	<div class="basic_box"><p class="text-center">
                	물리학이란 자연의 근본 원리를 탐구하는 기초과학 학문 체계 중 하나입니다.<br>
					주로 물질과 우주, 에너지와 시공간 상의 운동, 상호작용과 힘의 본질 등을 탐구합니다.<br>
					우리 학과에서는 아래와 같이 3개의 분과가 있습니다.</p></div>
                </div>
            </div>
        </section>
        
        <div class="py-5 bg-image-full" style="background-image: url('http://localhost:8282/AI_university_gong/resources/assets/img/field03.png'); height:250px">
            <!-- Put anything you want here! The spacer below with inline CSS is just for demo purposes!-->
            <div style="height: 20rem"></div>
        </div>
        
        <section class="py-1">
            <div class="container my-1">
                <div class="row justify-content-center">
                	<div><p class="text-center">
                	응용물리학(Applied physics)은 물리학 지식의 기술적, 실용적 응용을 목적으로 하는 물리학의 분과입니다.
                	응용물리학은 물리학적 지식들과 근본적인 개념을 바탕으로 다양하고 폭넓은 분야에 걸쳐 실제 장치나 소자나 시스템에 응용하는 데 관심이 있습니다.
                	단지 구체적인 무언가를 설계하는 것에 집중하는 것이 아니라 새로운 기술을 개발하거나 공학적 문제를 해결하기 위해 물리 연구를 수행합니다.
                	<br><br>
					물질의 특성과 응용에 관한 모든 영역을 연구하는 반도체물리학, 전자기 복사의 특성과 그 조작 및 제어를 연구하는 광물리학, 물리학 연구에 사용되는 개념과 방법론을 생물학적 현상에 적용하는 융합과학분야인 생물물리학 등이 모두 응용물리학의 분야들입니다.</p></div>
                </div>
            </div>
        </section>
        
        <section class="py-1">
            <div class="container my-1">
                <div class="justify-content-center">
                	<div class="basic_box"><p class="text-center"> 담당 교수님들의 소개입니다. </p></div><br>
                	<figure>
                		<img src="resources/assets/img/gong_insa_3.png" width="150px" height="150px">
                		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                		<img src="resources/assets/img/gong_insa_6.jpg" width="150px" height="150px">
                		<figcaption>&nbsp;&nbsp;&nbsp;[응용물리학 교사] 고릴라 &nbsp;&nbsp;&nbsp;&nbsp;[응용물리학 교수] 금덩이</figcaption>
                	</figure>
                </div>
            </div>
        </section>
        
        <footer class="footer">
            <div class="container">
                <div class="row">
                    <div class="col-lg-6 h-100 text-center text-lg-start my-auto">
                        <ul class="list-inline mb-2">
                            <h4 class="na2"> AI UNIVERSITY </h4>
                        </ul>
                        <p class="text-muted small mb-4 mb-lg-0 na2">TEL : 010-1234-8826 / FAX : 042-123-4567 / E-MAIL : tmd285@aiuni.com</p>
                       <p class="text-muted small mb-4 mb-lg-0 na2">대전 중구 선화동 비전직업전문학교</p>
                    </div>
                    <div class="col-lg-6 h-100 text-center text-lg-end my-auto">
                        <ul class="list-inline mb-0">
                            <li class="list-inline-item me-4">
                                <a href="#!"><i class="bi-facebook fs-3"></i></a>
                            </li>
                            <li class="list-inline-item me-4">
                                <a href="#!"><i class="bi-twitter fs-3"></i></a>
                            </li>
                            <li class="list-inline-item">
                                <a href="#!"><i class="bi-instagram fs-3"></i></a>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </footer>
        <div class="foot2">
             <li>&copy; OUR WEBSITE 2021. LEE SEUL YI / KIM SEUNG HYUN / LEE MIN GYU </li>
        </div>
        
</body>
</html>