<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="ai.uni.dao.*" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <title>AI대학교</title>
        <!-- Favicon-->
        <link rel="icon" type="image/x-icon" href="resources/main/assets/favicon.ico" />
        <!-- Bootstrap icons-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css" rel="stylesheet" type="text/css" />
        <!-- Google fonts-->
        <link href="https://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic,700italic" rel="stylesheet" type="text/css" />
        <!-- Core theme CSS (includes Bootstrap)-->
        <link href="resources/main/css/styles.css" rel="stylesheet" />
        <link href="resources/main/css/main_styles.css" rel="stylesheet" />
        
	   <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
	   <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
	   <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
	   <script src="https://kit.fontawesome.com/c998a172fe.js"></script>
	   <script src="http://code.jQuery.com/jQuery-3.2.1.min.js"></script>
	   <style>
		.lf{
			color:white;
			text-decoration:none;
			align-text:center;
		}
		.na{
			color:black;
			text-decoration:none;
		}
		.na2{
			color:white;
			text-decoration:none;
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
		</style>
		
		<!-- exe파일 실행 -->
		<script type="text/javascript">
		    function system(){
		      var path = "C:\\file\\uni-system.exe";
		      var filePath = String.fromCharCode(34)+path+String.fromCharCode(34);
		      var objShell = new ActiveXObject("WScript.Shell");
		      objShell.Run(filePath);
		</script>
		
		<!-- 검색기능 -->
		<script>
		$(document).ready(function(){
		   $("div.item2").hide();
		   
		   $("input.JQKye").keyup(function(){
		      var A = $(this).val();
		      var B = $("div.item2:contains('" + A + "')");
		      var C = "";
		      
		      $("div.item2").hide();
		      $(B).show();
		      if (A == C){
		         $("div.item2").hide();
		      }
		   });
		});
		
		function login_admin_btn(){
			alert('관리자 계정으로 로그인 되어있습니다. 로그아웃 후 다시 이용해주세요.');
		}
		</script>
		
		<!-- system열때 조건 -->
		<script>
			if()
		</script>
		
    </head>
    
    <body>
	<!-- nav -->
		<nav>
	         <div class="menu-icon">
	            <span class="fas fa-bars"></span>
	         </div>
	         <div class="logo">
	            AI대학교
	         </div>
	         <div class="nav-items">
	            <li><a href="aiuni">UNIVERSITY</a></li>
	            <li><a href="#intro">DEPARTMENTS</a></li>
	            <li><a href="#info">INFORMATION</a></li>
	            <li><a href="http://localhost:8282/board/list/">EVENT</a></li>
	         </div>
	         <div class="nav-items">
	         &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	         &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	         &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	         	<li><a href="http://localhost:8282/lib/libhome.jsp">LIBRARY</a></li>
	         	<li><a href="infosys:system()">SYSTEM</a></li>
	         	<li><a href="logout">LOGOUT</a></li>
	         </div>
	      </nav>
        
        <!-- search-->
        <header class="masthead">
            <div class="container position-relative">
                <div class="row justify-content-center">
                    <div class="col-xl-6">
                        <div class="text-center text-white">
                            
                            <!-- Page heading-->
                            <h2 class="mb-5">AI대학교에 오신것을 환영합니다</h2>
                            
							<div class="searchbox12">
						      <div class="header12">
						        <h3>Search</h3>
						        <p>단어를 누르면 해당 page로 넘어갑니다.</p>
						        <input class="JQKye" type="text" id="value2" placeholder="검색어를 입력하세요.">
						      </div>

						      <div class="container2">
						        <div class="item2">
						          <span class="icon2">＊</span>
						          <span class="name2"><a class="lf" href="aiuni#cintro">총장인사말</a></span>
						        </div>
						
						        <div class="item2">
						          <span class="icon2">＊</span>
						          <span class="name2"><a class="lf" href="aiuni#sim">대학슬로건</a></span>
						        </div>
						
						        <div class="item2">
						          <span class="icon2">＊</span>
						          <span class="name2"><a class="lf" href="aiuni#cam">캠퍼스투어</a></span>
						        </div>
						
						        <div class="item2">
						          <span class="icon2">＊</span>
						          <span class="name2"><a class="lf" href="#info">대학정보</a></span>
						        </div>
						
						        <div class="item2">
						          <span class="icon2">＊</span>
						          <span class="name2"><a class="lf" href="./board/list">공지사항</a></span>
						        </div>
						
						        <div class="item2">
						          <span class="icon2">＊</span>
						          <span class="name2"><a class="lf" href="./event/board/list">이달의 알림</a></span>
						        </div>
						
						        <div class="item2">
						          <span class="icon2">＊</span>
						          <span class="name2"><a class="lf" href="./qna/board/list">QnA</a></span>
						        </div>
						      </div>
						    </div>
						    
                        </div>
                    </div>
                </div>
            </div>
        </header>
        <!-- Icons Grid-->
        <section class="features-icons bg-light text-center">
            <div class="container">
                <div class="row">
                    <div class="col-lg-4">
                        <div class="features-icons-item mx-auto mb-5 mb-lg-0 mb-lg-3">
                            <div class="features-icons-icon d-flex"><i class="bi-layers m-auto text-primary"></i></div>
                            <h3><a class="na" href="intro1">대학소개</a></h3>
                            <p class="lead mb-0">총장인사말<br/>AI대학 상징<br/>조직도<br/>캠퍼스투어</p>
                        </div>
                    </div>
                    <div class="col-lg-4">
                        <div class="features-icons-item mx-auto mb-5 mb-lg-0 mb-lg-3">
                            <div class="features-icons-icon d-flex"><i class="bi-window m-auto text-primary"></i></div>
                            <h3><a class="na" href="#info">대학정보</a></h3>
                            <p class="lead mb-0">오시는길<br/>대표번호<br/>입학문의</p>
                        </div>
                    </div>
                    <div class="col-lg-4">
                        <div class="features-icons-item mx-auto mb-0 mb-lg-3">
                            <div class="features-icons-icon d-flex"><i class="bi-terminal m-auto text-primary"></i></div>
                            <h3><a class="na" href="http://localhost:8282/board/list/">대학알림</a></h3>
                            <p class="lead mb-0">공지사항<br/>이달의 알림<br/>자주하는질문<br/>Q&A</p>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- Image Showcases-->
        <section class="showcase" id="intro">
            <div class="container-fluid p-0">
                <div class="row g-0">
                   <div class="col-lg-6 order-lg-2 text-white showcase-img" style="background-image: url('resources/main/assets/img/img44.jpg'); opacity: 0.7"></div>
                    <div class="col-lg-6 order-lg-1 my-auto showcase-text">
                        <h2><a class="na" href="http://localhost:8282/college_medicine/index">의과대학</a></h2>
                        <p class="lead mb-0">최초의 근대 의학 교육기관인 ‘의학교’의 전통을 이어받아 기초의학교육뿐 아니라 인성교육, 리더십, 봉사정신 함양 등 우리 사회가 요구하는 다양한 인재 상을 배출할 수 있도록 교육하고 있다.</p>
                    </div>
                </div>
                <div class="row g-0">
                    <div class="col-lg-6 text-white showcase-img" style="background-image: url('resources/main/assets/img/img2.jpg'); opacity: 0.7"></div>
                    <div class="col-lg-6 my-auto showcase-text">
                        <h2><a class="na" href="http://localhost:8282/college/index">자연과학</a></h2>
                        <p class="lead mb-0">창의력, 첨단 과학기술, 성실성 및 현장 적응력을 겸비한 전문화, 실용화된 자연과학 인재 양성을 목표로 교육하고 있다.</p>
                    </div>
                </div>
                <div class="row g-0">
                    <div class="col-lg-6 order-lg-2 text-white showcase-img" style="background-image: url('resources/main/assets/img/img3.jpg'); opacity: 0.7"></div>
                    <div class="col-lg-6 order-lg-1 my-auto showcase-text">
                        <h2><a class="na" href="http://localhost:8282/AI_university_gong/main">공과대학</a></h2>
                        <p class="lead mb-0">공학과 관련한 학위를 부여하며, 교육 외에도 산업체나 연구소와 연계한 연구 및 개발을 하고 있다.</p>
                    </div>
                </div>
            </div>
        </section>
        
        <!-- Contact-->
        <section class="testimonials text-center bg-light" id="info">
            <div class="container">
            	<h2 class="mb-5">대학정보</h2>
            	<hr class="divider" />
            	<p class="text-muted mb-5">대전광역시 중구 선화동 중앙로121번길 20</p>    
		<!-- Map-->
     		<div class="row gx-4 gx-lg-5 justify-content-center mb-5">
           		<iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3214.3221904509987!2d127.42082741562416!3d36.32874050179464!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x35654926b16e6a0d%3A0x80d44fdc0a39062b!2z67mE7KC87KeB7JeF7KCE66y47ZWZ6rWQ!5e0!3m2!1sko!2skr!4v1631518967415!5m2!1sko!2skr" width="600" height="450" style="border:0;" allowfullscreen="" loading="lazy"></iframe>
           		<br />
        	</div>
            <div class="row gx-4 gx-lg-5 justify-content-center">
                <div class="col-lg-4 text-center mb-5 mb-lg-0">
                    <i class="bi-phone fs-2 mb-3 text-muted"></i>
                    <div>Tel : 010-1234-8826 </div>
                    <div>Fax : 042-123-4567</div>
                    <div>E-mail : tmd285@aiuni.com</div>
                </div>
            </div>
            </div>
        </section>
        
        <!-- Footer-->
        <footer class="footer">
            <div class="container">
                <div class="row">
                    <div class="col-lg-6 h-100 text-center text-lg-start my-auto">
                        <ul class="list-inline mb-2">
                            <li class="list-inline-item"><a class="na2" href="main2">대학홈페이지</a></li>
                            <li class="list-inline-item na2">⋅</li>
                            <li class="list-inline-item"><a class="na2" href="#intro">학부소개</a></li>
                            <li class="list-inline-item na2">⋅</li>
                            <li class="list-inline-item"><a class="na2" href="#info">대학정보</a></li>
                            <li class="list-inline-item na2">⋅</li>
                            <li class="list-inline-item"><a class="na2" href="http://localhost:8282/board/list/">대학알림</a></li>
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
        <script src="resources/main/js/scripts.js"></script>
        <!-- * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *-->
        <!-- * *                               SB Forms JS                               * *-->
        <!-- * * Activate your form at https://startbootstrap.com/solution/contact-forms * *-->
        <!-- * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *-->
        <script src="https://cdn.startbootstrap.com/sb-forms-latest.js"></script>
    </body>
</html>
