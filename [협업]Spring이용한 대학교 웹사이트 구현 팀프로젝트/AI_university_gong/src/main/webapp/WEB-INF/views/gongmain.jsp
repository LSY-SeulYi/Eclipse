<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<script src="http://code.jQuery.com/jQuery-3.2.1.min.js"></script>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>AI 대학교 공과대학</title>

    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
	
</head>
<style type="text/css">
.ho1_img1 {
	blckground-image : url("{% static 'img/moon.jpg' %}");
    height : 40px;
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

.txt{
	text-align:center;
	color:white;
}

.nav{
	background-color:#2F4F4F;
}
</style>

<body>

<nav class="nav navbar navbar-expand-lg navbar-dark fixed-top">
	<span class="navbar-brand mx-5 mb-0 font-weight-bold font-italic"><a class="text-white" href="http://localhost:8282/main1">AI 대학교</a>&nbsp;&nbsp;&nbsp;
	<a class="text-white" href="http://localhost:8282/gong/main">공과대학</a></span>
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

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<script src="https://kit.fontawesome.com/c998a172fe.js"></script>

<script src="http://code.jQuery.com/jQuery-3.2.1.min.js"></script>
<script>
$(document).ready(function(){
	$("div.ho1_img2").hide();
	$("div.ho1_img1").click(function(){
		$("div.ho1_img1").hide();
		$("div.ho1_img2").show();
		$("div.ho1").addClass("hoblack");
		$("div.ho1").removeClass("howhite");
	});
	$("div.ho1_img2").click(function(){
		$("div.ho1_img2").hide();
		$("div.ho1_img1").show();
		$("div.ho1").addClass("howhite");
		$("div.ho1").removeClass("hoblack");
	});
});
</script>

</body>
<body>
	<div>
		<div style="position: absolute;">
			<div style="position: relative; top: 400px; left: 100%;">
				<a href="http://localhost:8282/AI_university_gong/gong_research">
					<img src="resources/assets/img/BIGIMG1.png" width="150px" height="150px"></img>
					<div class="txt">
						연 구
					</div>
				</a>
			</div>
		</div>
		
		<div style="position: absolute;">
			<div style="position: relative; top: 400px; left: 210%;">
				<a href="http://localhost:8282/AI_university_gong/gong_education">
					<img src="resources/assets/img/BIGIMG2.png" width="150px" height="150px"></img>
					<div class="txt">
						교 육
					</div>
				</a>
			</div>
		</div>
		
		<div style="position: absolute;">
			<div style="position: relative; top: 580px; left: 210%;">
				<a href="http://localhost:8282/AI_university_gong/gong_insa">
					<img src="resources/assets/img/BIGIMG3.png" width="150px" height="150px"></img>
					<div class="txt">
						교 수 진
					</div>
				</a>
			</div>
		</div>
		
		<div style="position: absolute;">
			<div style="position: relative; top: 580px; left: 100%;">
				<a href="http://localhost:8282/AI_university_gong/gong_vision">
					<img src="resources/assets/img/noimg1.png" width="150px" height="150px"></img>
					<div class="txt">
						학 부 소 개
					</div>
				</a>
			</div>
		</div>
		<img src="resources/assets/img/IMG_8267.jpg" width="100%" height="800px">
	</div>
	
	<br><br><br>
	
	<div>
		<div align="center">
			<a href="http://localhost:8282/AI_university_gong/gong_research_1"><img src="resources/assets/img/BIGIMG4.jpg" width="150px" height="150px"></a>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<a href="http://localhost:8282/AI_university_gong/gong_research_2"><img src="resources/assets/img/BIGIMG5.jpg" width="150px" height="150px"></a>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<a href="http://localhost:8282/AI_university_gong/gong_research_3"><img src="resources/assets/img/BIGIMG6.jpg" width="150px" height="150px"></a>
			<br>
			<p>핵 입자 천체물리학 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 응집 물질 물리학 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 응용 물리학 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</p>
		</div>
	</div>
	
	<span class="navbar-brand mx-5 mb-0 font-weight-bold font-italic">
		공학과 관련한 학위를 부여하며, 교육 외에도 산업체나 연구소와 연계한 연구 및 개발을 하고 있다.<br>
	</span>
	<span class="navbar-brand mx-5 mb-0 font-weight-bold font-italic">
		<h6>
		AI대학교 공과대학은 물리학의 다양한 분야에 대해 우수한 교수진과 세계적인 수준의 연구환경을 학생들에게 제공합니다.<br>
		자연의 원리에 대한 탐구심과 새로운 현상에 대한 호기심을 가진 여러분을 환영합니다.
		</h6>
	</span>
	
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
	
</body>
</html>
