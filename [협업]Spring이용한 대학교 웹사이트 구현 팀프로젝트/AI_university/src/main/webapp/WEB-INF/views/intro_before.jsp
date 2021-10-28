<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
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
			padding-bottom:10px;
			background-color:#323232;
			color:#bebebe;
			width: 100%;
			height: 40px;
			text-align:center;
			align:center;
		}
		.profile-user-img{
			width:150px;
			height:150px;
			border-radius:70%;
			overflow:hidden;
		}
		.profile-user-img-img{
			width:100%;
			height:100%;
			object-fit:cover;
		}
		.user-img{
			width:300px;
			height:300px;
		}
	   </style>

    <body> 
    
	<!-- nav -->
	<nav>
         <div class="menu-icon">
            <span class="fas fa-bars"></span>
         </div>
         <div class="logo">
            <a class="na2" href="main1">AI대학교</a>
         </div>
         <div class="nav-items">
            <li><a href="aiuni">UNIVERSITY</a></li>
            <li><a href="main1#intro">DEPARTMENTS</a></li>
            <li><a href="main1#info">INFOMATION</a></li>
            <li><a href="http://localhost:8282/event/board/list_after/">EVENT</a></li>
         </div>
         <div class="nav-items">
         	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
         	<li><a href="#hong">홍보영상</a></li>
         	<li><a href="#cintro">역대총장</a></li>
         	<li><a href="#intro">총장인사</a></li>
         	<li><a href="#sim">대학슬로건</a></li>
         	<li><a href="#cam">캠퍼스투어</a></li>
         </div>
      </nav>
	<section class="features-icons bg-light text-center" id="hong">
	  <div class="container">
        <h2 class="mb-5">홍보영상</h2>
        <hr class="divider" />
        <p class="text-muted mb-5">AI대학교 홍보영상입니다.</p>
        <div class="row">
		  <video  src="resources/main/assets/mp4/hong.mp4" controls>홍보영상</video>
   		</div>
	  </div>
	</section>
	<section class="features-icons bg-light text-center" id="ma">
	  <div class="container">
        <h2 class="mb-5">AI대학교 마스코트</h2>
        <hr class="divider" />
        <p class="text-muted mb-5">AI대학교 마스코트 "퍼그"와 인사해보세요.</p>
        <div>
        	<img class="user-img" src="resources/assets/img/ma.jpeg">
        </div>
        <br/>
        <p>회원가입할 때 만날 수 있어요.</p>
	</section>
        <!-- Icons Grid-->
        <section class="features-icons bg-light text-center" id="cintro">
            <div class="container">
            	<h2 class="mb-5">역대총장</h2>
            	<hr class="divider" />
            	<p class="text-muted mb-5">역대 총장님들의 인사를 들어보세요.</p>
                <div class="row">
                    <div class="col-lg-4">
                    	<div class="profile-user-img">
                    		<img src="resources/main/assets/img/img_c.jpg" class="profile-user-img-img">
                    	</div>
                        <h3>제 1대 총장 '미니언즈 광광'</h3>
                        <p class="lead mb-0">안녕하세요.</p>
                    </div>
                    <div class="col-lg-4">
                    	<div class="profile-user-img">
                    		<img src="resources/main/assets/img/mi2.jpg" class="profile-user-img-img">
                    	</div>
                        <h3>제 2대 총장 '도망자 솽솽'</h3>
                        <p class="lead mb-0">안녕하세요.</p>
                    </div>
                    <div class="col-lg-4">
                    	<div class="profile-user-img">
                    		<img src="resources/main/assets/img/mi3.jpg" class="profile-user-img-img">
                    	</div>
                        <h3>제 3대 총장 '스프링 왕왕'</h3>
                        <p class="lead mb-0">안녕하세요.</p>
                    </div>
                    <br/>
                    <br/>
                    <div class="col-lg-4">
                    	<div class="profile-user-img">
                    		<img src="resources/main/assets/img/mi4.jpg" class="profile-user-img-img">
                    	</div>
                        <h3>제 4대 총장 '물개닮은 오롱'</h3>
                        <p class="lead mb-0">안녕하세요.</p>
                    </div>
                    <div class="col-lg-4">
                    	<div class="profile-user-img">
                    		<img src="resources/main/assets/img/mi1.jpg" class="profile-user-img-img">
                    	</div>
                        <h3>제 5대 총장 '한복입은 도롱이'</h3>
                        <p class="lead mb-0">안녕하세요.</p>
                    </div>
                    <div class="col-lg-4">
                    	<div class="profile-user-img">
                    		<img src="resources/main/assets/img/mi7.jpg" class="profile-user-img-img">
                    	</div>
                        <h3>제 6대 총장 '바나나 총총이'</h3>
                        <p class="lead mb-0">안녕하세요.</p>
                    </div>
                </div>
			</div>
        </section>
        
        <!-- Image Showcases-->
        <section class="showcase" id="intro">
        <br/>
        <div class="container">
        <h2 class="mb-5" style="text-align:center;">총장인사말</h2>
       	<hr class="divider" />
       	<p class="text-muted mb-5" style="text-align:center;">7대 총장'OHhong'의 인사말</p> 	
            <div class="container-fluid p-0">
                <div class="row g-0">
                    <div class="col-lg-6 text-white showcase-img" style="background-image: url('resources/main/assets/img/mi5.jpeg'); opacity: 0.7"></div>
                    <div class="col-lg-6 my-auto showcase-text">
                        <h2><a class="na" href="#">7대총장 'OHhong'</a></h2>
                        <p class="lead mb-0">Thanks to endeavors made by many stakeholders
	                        since it was founded by Mr. Im Dal-Gyou based on the principles of National Development,
	                        Cultural Creation, and Social Service, Daejeon University has become what it is today.
	                        We all are working hard to further advance our proud history,
	                        developed with our commitments and services to the nation and society,
	                        and to make the Hyehwa value system put down permanent roots in this soil.</p>
                    </div>
                </div>
            </div>
        </div>
        </section>
        
        <section class="features-icons bg-light text-center" id="sim">
            <div class="container">
            	<h2 class="mb-5">대학 슬로건</h2>
            	<hr class="divider" />
            	<p class="text-muted mb-5">AI대학교 슬로건입니다.</p>
            	<div class="row">
	        		<div class="col-lg-4">
		               	<div class="user-img">
		               		<img src="resources/main/assets/img/ho1.gif" class="profile-user-img-img">
		               	</div>
		               	<h3>함께 성장하고</h3>
	                </div>
	                <div class="col-lg-4">
	                	<div class="user-img">
	                		<img src="resources/main/assets/img/ho2.gif" class="profile-user-img-img">
	                	</div>
	                	<h3>사랑하는</h3>
	                </div>
	                <div class="col-lg-4">
	                	<div class="user-img">
	                		<img src="resources/main/assets/img/ho3.gif" class="profile-user-img-img">
	                	</div>
	                	<h3>우리들</h3>
	                </div>
                </div>
            </div>
         </section>
        
        <!-- 슬라이드 -->
		  <script>
			var index=0;
			window.onload=function(){
				slideShow();
			}
			
			function slideShow(){
				var i;
				var x = document.getElementsByClassName("slide1");
				for(i=0; i<x.length; i++){
					x[i].style.display="none";
				}
				index++;
				if(index>x.length){
					index=1;
				}
				x[index-1].style.display="block";
				setTimeout(slideShow,3000);
			}
		 </script>
		 
        <!-- Contact-->
        <section class="testimonials text-center bg-light" id="cam">
            <div class="container">
            	<h2 class="mb-5">캠퍼스투어</h2>
            	<hr class="divider" />
            	<p class="text-muted mb-5">자동으로 넘어가는 사진을 보며 캠퍼스를 간접 투어해보세요.</p>    
		<!-- Map-->
     		<div class="row gx-4 gx-lg-5 justify-content-center mb-5">
           		<table border="4px" style="border-color:green">
				<tr>
					<td>
						<img class="slide1" src="resources/main/assets/img/mimi1.jpg" width=100% height=500px alt="image">
						<img class="slide1" src="resources/main/assets/img/mimi2.jpg" width=100% height=500px alt="image">
						<img class="slide1" src="resources/main/assets/img/mimi4.jpg" width=100% height=500px alt="image">
						<img class="slide1" src="resources/main/assets/img/mimi5.jpg" width=100% height=500px alt="image">
						<img class="slide1" src="resources/main/assets/img/cam11.jpg" width=100% height=500px alt="image">
						<img class="slide1" src="resources/main/assets/img/cam31.jpg" width=100% height=500px alt="image">
						<img class="slide1" src="resources/main/assets/img/cam41.jpg" width=100% height=500px alt="image">
						<img class="slide1" src="resources/main/assets/img/cam51.jpg" width=100% height=500px alt="image">
					</td>
				</tr>
				</table>
           		<br />
        	</div>
            <div class="row gx-4 gx-lg-5 justify-content-center">
                <div class="col-lg-4 text-center mb-5 mb-lg-0">
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
                            <li class="list-inline-item"><a class="na2" href="main1">대학홈페이지</a></li>
                            <li class="list-inline-item na2">⋅</li>
                            <li class="list-inline-item"><a class="na2" href="main1#intro">학부소개</a></li>
                            <li class="list-inline-item na2">⋅</li>
                            <li class="list-inline-item"><a class="na2" href="main1#info">대학정보</a></li>
                            <li class="list-inline-item na2">⋅</li>
                            <li class="list-inline-item"><a class="na2" href="#">대학알림</a></li>
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
