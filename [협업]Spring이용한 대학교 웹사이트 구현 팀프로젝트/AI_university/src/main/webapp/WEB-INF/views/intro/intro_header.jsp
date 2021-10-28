<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>대학소개_총장인사말</title>
        <!-- Favicon-->
        <link rel="icon" type="image/x-icon" href="/resources/main/assets/favicon.ico" />
        <!-- Core theme CSS (includes Bootstrap)-->
        <link href="/resources/main/css/intro_styles.css" rel="stylesheet" type="text/css" />
        
        <script src="http://code.jQuery.com/jQuery-3.2.1.min.js"></script>
		<!-- exe파일 실행 -->
		<script type="text/javascript">
		    function system(){
		      var path = "C:\\file\\uni-system.exe";
		      var filePath = String.fromCharCode(34)+path+String.fromCharCode(34);
		      var objShell = new ActiveXObject("WScript.Shell");
		      objShell.Run(filePath);
			}
		</script>
		
    </head>
    <body>
    <!-- nav -->
        <!-- Navigation-->
        <nav class="navbar navbar-light bg-light static-top" id="container">
            <div class="container">
                <a class="navbar-brand" href="main1">AI대학교</a>
                <table>
                	<tr>
						<td><a href="#">Login</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
						<td><a href="#">Join</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
						<td><a href="infosys:system()">System</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
						<td><a href="#">Library</a></td>
                	</tr>
                </table>
            </div>
        </nav>

        <header class="masthead">
            <div class="container position-relative">
                <div class="row justify-content-center">
                    <div class="col-xl-6">
                        <div class="text-center text-white">
                            <!-- Page heading-->
                            <h1 class="mb-5">AI대학교</h1>
                        </div>
                    </div>
                </div>
            </div>
        </header>

        <div class="d-flex" id="wrapper">
            <!-- Sidebar-->
            <div class="border-end bg-white" id="sidebar-wrapper">
                <div class="sidebar-heading border-bottom bg-light">대학소개</div>
                <div class="list-group list-group-flush">
                    <a class="list-group-item list-group-item-action list-group-item-light p-3" href="intro1">총장인사말</a>
                    <a class="list-group-item list-group-item-action list-group-item-light p-3" href="intro2">대학상징</a>
                    <a class="list-group-item list-group-item-action list-group-item-light p-3" href="intro3">조직도</a>
                    <a class="list-group-item list-group-item-action list-group-item-light p-3" href="intro4">캠퍼스투어</a>
                </div>
            </div>
 
            <!-- Page content wrapper-->
            <div id="page-content-wrapper">
                <!-- Top navigation-->
                <nav class="navbar navbar-expand-lg navbar-light bg-light border-bottom" style="margin-bottom: 0">

                </nav>
        <!-- Bootstrap core JS-->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js"></script>
        <!-- Core theme JS-->
        <script src="/resources/main/js/intro_scripts.js"></script>