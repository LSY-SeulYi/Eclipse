<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     </div>
        <!-- /#page-wrapper -->

    </div>
    <!-- /#wrapper -->

    <!-- jQuery 주석처리 -->
<!--     <script src="/resources/vendor/jquery/jquery.min.js"></script> -->

    <!-- Bootstrap Core JavaScript -->
    <script src="/resources/vendor/bootstrap/js/bootstrap.min.js"></script>

    <!-- Metis Menu Plugin JavaScript -->
    <script src="/resources/vendor/metisMenu/metisMenu.min.js"></script>

    <!-- DataTables JavaScript -->
    <script src="/resources/vendor/datatables/js/jquery.dataTables.min.js"></script>
    <script src="/resources/vendor/datatables-plugins/dataTables.bootstrap.min.js"></script>
    <script src="/resources/vendor/datatables-responsive/dataTables.responsive.js"></script>

    <!-- Custom Theme JavaScript -->
    <script src="/resources/dist/js/sb-admin-2.js"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css" rel="stylesheet" type="text/css" />
    <link href="/resources/college/css/bootstrap-icons.css" rel="stylesheet" type="text/css" />
            <style>
		.list-inline {
 			margin-left: -165px;
		}
		.na3{
			color:white;
			text-decoration:none;
			font-family: 'Montserrat', sans-serif;
			font-size: 16px;
			position: left;
		}
		.footer{
			background-color:#2F4F4F;
			height : 110px;
			padding: 16px 0px 64px;
			align: left;
			
		}
		.text-muted{
			font-size: 14px;
			color:gray;
			font-family: 'Montserrat', sans-serif;
			text-align: left;
			margin-bottom: 0px;
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
			margin-bottom: 0px;
			font-size: 16px;
		}
		</style>

    <!-- Page-Level Demo Scripts - Tables - Use for reference -->
<script>
  $(document).ready(function() {
    $('#dataTables-example').DataTable({
      responsive: true
    });
    $(".sidebar-nav")
      .attr("class","sidebar-nav navbar-collapse collapse")
      .attr("aria-expanded",'false')
      .attr("style","height:1px");
  });
</script>
<br>
		<footer class="footer">
            <div class="container">
                <div class="row">
                    <div class="col-lg-6 h-100 text-center text-lg-start my-auto">
                        <ul class="list-inline mb-2">
                            <li class="list-inline-item"><a class="na3" href="http://localhost:8282/main1#container">대학홈페이지</a></li>
                            <li class="list-inline-item na3">⋅</li>
                            <li class="list-inline-item"><a class="na3" href="http://localhost:8282/main1#intro">학부소개</a></li>
                            <li class="list-inline-item na3">⋅</li>
                            <li class="list-inline-item"><a class="na3" href="http://localhost:8282/main1#info">대학정보</a></li>
                            <li class="list-inline-item na3">⋅</li>
                            <li class="list-inline-item"><a class="na3" href="http://localhost:8282/board/list_before/">대학알림</a></li>
                        </ul>
                        <p class="text-muted small mb-4 mb-lg-0 na3">TEL : 010-1234-8826 / FAX : 042-123-4567 / E-MAIL : tmd285@aiuni.com</p>
                    	<p class="text-muted small mb-4 mb-lg-0 na3">대전 중구 선화동 비전직업전문학교</p>
                    </div>
<!--                     <div class="col-lg-6 h-100 text-center text-lg-end my-auto" style="font-size:28px; margin-top:10px; margin-right:-30px"> -->
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
