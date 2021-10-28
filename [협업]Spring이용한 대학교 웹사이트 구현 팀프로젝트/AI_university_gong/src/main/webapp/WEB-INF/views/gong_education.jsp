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
		<div class="py-5 bg-image-full" style="background-image: url('http://localhost:8282/AI_university_gong/resources/assets/img/gong_asd3.png'); height:250px">
            <!-- Put anything you want here! The spacer below with inline CSS is just for demo purposes!-->
            <div style="height: 20rem"></div>
        </div>
        <!-- Content section-->
        <section class="py-1">
            <div class="container my-1">
                <div class="row justify-content-center">
                	<div class="basic_box"><p class="text-center">물리학의 기본적이고 핵심적인 원리에 대한 깊은 이해와 함께,<br>실험과목과 선택과목을 통한 물리학적 지식의 활용을 조화롭게 추구합니다.</p></div>
                </div>
            </div>
        </section>
        <section class="py-1">
            <div class="container my-1">
        		<table class="row justify-content-center text-center">
        			<thead style="height: 60px">
        				<tr>
        					<th style="width: 215px;" class="basic_box">교과목명</th>
        					<th style="width: 1000px;" class="basic_box">교과내용</th>
        				</tr>
        			</thead>
        			<tbody>
        			
        				<tr>
        					<th style="width: 215px;" class="basic_box2">
        						<p>물리학실험(A-1)</p>
        					</th>
        					<td style="width: 1000px;" class="basic_box2">
        						<p>직류 및 교류의 전류와 전압과 관련된 기본회로, 저항, 축전기, 인덕터 등 선형 전자요소 회로를 비롯하여,
        						<br> 다이오드 트랜지스터, OP-amp, 전원장치의 특성 및 설계 등에 대한 기본 이론과 실험 교육을 통하여 실험물리학을 한 전자공학적 이해를 얻는다.
								<br>선수추천과목 : 일반물리학 및 실험(1), (2)</p>
        					</td>
        				</tr>
        				
        				<tr>
        					<th style="width: 215px;" class="basic_box2">
        						<p>양자역학(1), (2)</p>
        					</th>
        					<td style="width: 1000px;" class="basic_box2">
        						<p>고전역학의 개요, 고전양자론, 슈레딩거 방정식, 구대칭계의 문제, 각 운동량, 건드림이론, 변분법, WKB근사법, 산란문제, 다체문제 등을 배운다.
								<br>선수추천과목 : 일반역학(1), (2), 고등미적분학(1), (2)</p>
        					</td>
        				</tr>
        				
        				<tr>
        					<th style="width: 215px;" class="basic_box2">
        						<p>전자기학(1), (2)</p>
        					</th>
        					<td style="width: 1000px;" class="basic_box2">
        						<p>자유전자의 전기장, 유전체이론, 정전에너지, 전류 및 직류회로의 기본개념, 자기학, 전자유도, 물질의 자기적 성질, 교류이론, Maxwell의 방정식 및 전자파이론을 배운다.
								<br>선수추천과목 : 일반물리학 및 실험(1), (2), 고등미적분학(1), (2)</p>
        					</td>
        				</tr>
        				
        				<tr>
        					<th style="width: 215px;" class="basic_box2">
        						<p>통계물리학</p>
        					</th>
        					<td style="width: 1000px;" class="basic_box2">
        						<p>고전 통계 역학, 기체운동론, Maxwell-Boltzmann 통계, 양자 통계 역학, Bose-Einstein 통계, Fermi-Dirac 통계 등에 대해 배운다.
								<br>선수추천과목 : 일반물리학 및 실험(1), (2), 양자역학(1), 열물리학</p>
        					</td>
        				</tr>
        				
        				<tr>
        					<th style="width: 215px;" class="basic_box2">
        						<p>물리학실험(B-1)</p>
        					</th>
        					<td style="width: 1000px;" class="basic_box2">
        						<p>마이크로파, 전자의 e/m측정, Franck-Hertz실험, 광학실험, 밀리컨 기름방울 실험 등 물성 측정 실험 및 현대물리에 관한 기본실험에 대해 배운다.
								<br>선수추천과목 : 일반물리학 및 실험(1), (2)</p>
        					</td>
        				</tr>
        				
        				<tr>
        					<th style="width: 215px;" class="basic_box2">
        						<p>일반역학(1), (2)</p>
        					</th>
        					<td style="width: 1000px;" class="basic_box2">
        						<p>벡터, 질점역학, 조화운동, 감쇠 및 강제진동, 강체역학, 세차운동, Euler방정식, 해석역학 Lagrange의 방정식, Hamilton의 방정식, 최소작용의 원리 등을 배운다.
								<br>선수추천과목 : 일반물리학 및 실험(1), (2), 미적분학(1), (2)</p>
        					</td>
        				</tr>
        				
        			</tbody>
        		</table>
        	</div>
        </section>
        
        <!-- Footer-->
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
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js"></script>
        <!-- Core theme JS-->
        <script src="resources/js/scripts.js"></script>
        
</body>
</html>