<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@include file="intro_header.jsp"%>
                
		<!-- Page content-->
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
		
		<!-- 슬라이드 img -->
		<div class="container-fluid" align="center">
			<h1 class="mt-4">캠퍼스투어</h1>
			<br/>
			<div>
				<table border="4px" style="border-color:green">
				<tr>
					<td>
						<img class="slide1" src="/resources/main/assets/img/cam1.jpg" width=1000px height=500px alt="image">
						<img class="slide1" src="/resources/main/assets/img/cam4.jpg" width=1000px height=500px alt="image">
						<img class="slide1" src="/resources/main/assets/img/cam3.jpg" width=1000px height=500px alt="image">
						<img class="slide1" src="/resources/main/assets/img/cam5.jpg" width=1000px height=500px alt="image">
						<img class="slide1" src="/resources/main/assets/img/cam6.png" width=1000px height=500px alt="image">
					</td>
				</tr>
				</table>
			</div>
		</div>
		

<%@include file="intro_footer.jsp"%>	