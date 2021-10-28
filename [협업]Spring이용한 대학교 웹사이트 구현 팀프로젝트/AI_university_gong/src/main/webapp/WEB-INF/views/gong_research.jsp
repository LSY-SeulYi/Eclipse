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
		<section class="py-1">
            <div class="container my-1">
                <div class="row justify-content-center">
                	<div class="basic_box"><p class="text-center">물리학의 기본적이고 핵심적인 원리에 대한 깊은 이해와 함께,<br>실험과목과 선택과목을 통한 물리학적 지식의 활용을 조화롭게 추구합니다.</p></div>
                    
                </div>
            </div>
        </section>

	<!-- Image element - set the background image for the header in the line below-->
        <div class="py-5 bg-image-full" style="background-image: url('http://localhost:8282/AI_university_gong/resources/assets/img/research_field01.png'); height:250px">
            <!-- Put anything you want here! The spacer below with inline CSS is just for demo purposes!-->
            <div style="height: 20rem"></div>
        </div>
        <!-- Content section-->
        
        <section class="py-1">
            <div class="container my-1">
                <div class="row justify-content-center">
                    <div class="col-lg-8">
                        <h2><a href="http://localhost:8282/AI_university_gong/gong_research_1">핵 입자 천체물리학<br>(Nuclear • Particle • Astrophysics)</a></h2>
                        <p class="lead">자연을 구성하는 가장 작은 단위의 입자들부터 거시적인 항성들과 블랙홀에 이르는 넓은 영역을 연구하는 분야입니다.</p>
                    </div>
                </div>
            </div>
        </section>
        
        <div class="py-5 bg-image-full" style="background-image: url('http://localhost:8282/AI_university_gong/resources/assets/img/field02.png'); height:250px">
            <!-- Put anything you want here! The spacer below with inline CSS is just for demo purposes!-->
            <div style="height: 20rem"></div>
        </div>
        <!-- Content section-->
        <section class="py-1">
            <div class="container my-1">
                <div class="row justify-content-center">
                    <div class="col-lg-8">
                        <h2><a href="http://localhost:8282/AI_university_gong/gong_research_2">응집물질물리학<br>(Condensed matter physics)</a></h2>
                        <p class="lead">기본적으로 물질에 존재하는 준입자의 거동과 상호작용을 바탕으로 물질의 성질을 이해하는 학문 체계입니다.</p>
                    </div>
                </div>
            </div>
        </section>
        
        <div class="py-5 bg-image-full" style="background-image: url('http://localhost:8282/AI_university_gong/resources/assets/img/field03.png'); height:250px">
            <!-- Put anything you want here! The spacer below with inline CSS is just for demo purposes!-->
            <div style="height: 20rem"></div>
        </div>
        <!-- Content section-->
        <section class="py-1">
            <div class="container my-1">
                <div class="row justify-content-center">
                    <div class="col-lg-8">
                        <h2><a href="http://localhost:8282/AI_university_gong/gong_research_3">응용물리학<br>(Applied physics)</a></h2>
                        <p class="lead">물리학 지식의 기술적, 실용적 응용을 목적으로 하는 물리학의 분과입니다.</p>
                    </div>
                </div>
            </div>
        </section>
        
        <!-- Bootstrap core JS-->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js"></script>
        <!-- Core theme JS-->
        <script src="resources/js/scripts.js"></script>
        
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