<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>AI대학교 게시판</title>
	
    <!-- Bootstrap Core CSS -->
    <link href="/resources/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- MetisMenu CSS -->
    <link href="/resources/vendor/metisMenu/metisMenu.min.css" rel="stylesheet">

    <!-- DataTables CSS -->
    <link href="/resources/vendor/datatables-plugins/dataTables.bootstrap.css" rel="stylesheet">

    <!-- DataTables Responsive CSS -->
    <link href="/resources/vendor/datatables-responsive/dataTables.responsive.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="/resources/dist/css/sb-admin-2.css" rel="stylesheet">
	<link href="/resources/main/css/main_styles.css" rel="stylesheet" />
	
    <!-- Custom Fonts -->
    <link href="/resources/vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
	<script src="http://code.jQuery.com/jQuery-3.2.1.min.js"></script>
	<!-- exe파일 실행 -->
	<script type="text/javascript">
	   function myHr(){
	     var path = "C:\\file\\uni-system.exe";
	     var filePath = String.fromCharCode(34)+path+String.fromCharCode(34);
	     var objShell = new ActiveXObject("WScript.Shell");
	     objShell.Run(filePath);
	}
	</script>
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
		
		function login_before_btn(){
			alert('로그인 후 이용 가능합니다.');
		}
		</script>
		<style>
		.na2{
			color:white;
			text-decoration:none;
		}
		.mb-5{
			color:white;
			align:center;
			text-align:center;
			margin-bottom: 3rem !important;
		}
	</style>
</head>

<body>

    <div id="wrapper">

        <!-- Navigation -->
        <nav>
	         <div class="menu-icon">
	            <span class="fas fa-bars"></span>
	         </div>
	         <div class="logo">
	            <a class ="na2" href="http://localhost:8282/main1">AI대학교</a>
	         </div>
	         <div class="nav-items">
	            <li><a href="http://localhost:8282/aiuni">UNIVERSITY</a></li>
	            <li><a href="http://localhost:8282/main1#intro">DEPARTMENTS</a></li>
	            <li><a href="http://localhost:8282/main1#info">INFORMATION</a></li>
	            <li><a href="http://localhost:8282/board/list_before/">EVENT</a></li>
	         </div>
	         <div class="nav-items">
	         &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	         &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	         &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	         	<li><a href="javascript:login_before_btn()">LIBRARY</a></li>
	         	<li><a href="javascript:login_before_btn()">SYSTEM</a></li>
	         	<li><a href="javascript:login_before_btn()">LOGOUT</a></li>
	         </div>
	      </nav>
			<header>
	    		<section id="masthead">
	    			<div class="text-center text-white">
                		<h2 class="mb-5"></h2>
                	</div>
            </div>
         	<div class="navbar-default sidebar" role="navigation">
                <div class="sidebar-nav navbar-collapse">
                    <ul class="nav" id="side-menu"><br><br>
                        <li>
                            <a href="http://localhost:8282/board/list_before/"><i class="fa fa-dashboard fa-fw"></i> 공지사항</a>
                        </li><br>
                        <li>
                            <a href="http://localhost:8282/event/board/list_before/"><i class="fa fa-table fa-fw"></i> 이달의 알림</a>
                        </li><br>
                        <li>
                            <a href="http://localhost:8282/faq/board/list_before/"><i class="fa fa-edit fa-fw"></i> 자주하는 질문</a>
                        </li> <br>
                        <li>
                            <a href="http://localhost:8282/qna/board/list_before/"><i class="fa fa-sitemap fa-fw"></i> Q&A</a>
                        </li>
                    </ul>
                </div>
                <!-- /.sidebar-collapse -->
            </div>
            <!-- /.navbar-static-side -->
        </section>
		</header>

        <div id="page-wrapper">
        
       <!--  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script> -->
       <script src="/resources/js/jquery.min.js"></script>