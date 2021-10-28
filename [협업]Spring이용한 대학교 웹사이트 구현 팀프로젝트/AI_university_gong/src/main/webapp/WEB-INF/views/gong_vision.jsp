<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>AI 대학교 공과대학</title>
        <!-- Favicon-->
        <link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
        <!-- Bootstrap icons-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css" rel="stylesheet" />
        <!-- Core theme CSS (includes Bootstrap)-->
        <link href="resources/css/styles3.css" rel="stylesheet" />
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        
<style>
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
        <!-- Responsive navbar-->
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
		
		<div class="py-5 bg-image-full" style="background-image: url('http://localhost:8282/AI_university_gong/resources/assets/img/gong_asd3.png'); height:250px">
            <!-- Put anything you want here! The spacer below with inline CSS is just for demo purposes!-->
            <div class="container px-5">
                <div class="row gx-5 justify-content-center">
                    <div class="col-lg-6">
                        <div class="text-center my-5">
                            <h1 class="display-5 fw-bolder text-black mb-2">AI대학교 공과대학</h1>
                            <p class="lead text-black-100 mb-4">6달의 역사와 기술, 그리고 비젼!</p>
                            <div class="d-grid gap-3 d-sm-flex justify-content-sm-center">
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div style="height: 20rem"></div>
        </div>
		
        <!-- Features section-->
        <section class="py-5 border-bottom" id="features">
            <div class="container px-5 my-5">
                <div class="row gx-5">
                    <div class="col-lg-4 mb-5 mb-lg-0">
                        <div class="feature bg-primary bg-gradient text-white rounded-3 mb-3"><i class="bi bi-collection"></i></div>
                        <h2 class="h4 fw-bolder">역사</h2>
                        <p>6달간의 노력과 헌신으로 만들어진 AI 공과대학!</p>
                    </div>
                    <div class="col-lg-4 mb-5 mb-lg-0">
                        <div class="feature bg-primary bg-gradient text-white rounded-3 mb-3"><i class="bi bi-building"></i></div>
                        <h2 class="h4 fw-bolder">비젼</h2>
                        <p>수준높은 지식을 겸비한 거짓없는 순수. 그리고 배움의 즐거움과 감사. 배움을 전파하는 나눔. 그것이 우리의 비젼입니다.</p>
                    </div>
                    <div class="col-lg-4">
                        <div class="feature bg-primary bg-gradient text-white rounded-3 mb-3"><i class="bi bi-toggles2"></i></div>
                        <h2 class="h4 fw-bolder">성과</h2>
                        <p>지난 6달간 다양한 성과를 이루었으며, 많은 배움과 지식을 나누었습니다.</p>
                    </div>
                </div>
        <br><br><br><br><br>
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
        
        <!-- Bootstrap core JS-->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js"></script>
        <!-- Core theme JS-->
        <script src="resources/js/scripts.js"></script>
        <!-- * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *-->
        <!-- * *                               SB Forms JS                               * *-->
        <!-- * * Activate your form at https://startbootstrap.com/solution/contact-forms * *-->
        <!-- * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *-->
        <script src="https://cdn.startbootstrap.com/sb-forms-latest.js"></script>
    </body>
</html>
        