<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>

<!--  JSP에서 jsoup을 사용하기 위해 import -->
<%@ page import="org.jsoup.Jsoup"%>
<%@ page import="org.jsoup.nodes.Document"%>
<%@ page import="org.jsoup.nodes.Element"%>
<%@ page import="org.jsoup.select.Elements"%>
<%@ page import="com.cro.coloDto" %>
<%
request.setCharacterEncoding("UTF-8");
	response.setContentType("text/html; charset=UTF-8");
	//out.println("Title : " + e.select(".tit a").text());
	//out.println("Link : " + e.select(".tit a").attr("href"));
%>

<% String libtxt = request.getParameter("libtxt");%>
<% String libnum = request.getParameter("libnum");%>
<% String libcs = request.getParameter("libcs");%>
<% int libcs_sub = 0; %>
<% if (libnum == null){libnum = "&currentPageNo=1";};%>
<% if (libtxt == null){libtxt = "도서관";};%>
<% if (libcs == null){libcs = "0";} %>

	<%
	String libXXX = "img.logo_sta";
		Document doc2 = Jsoup.connect("https://www.snlib.go.kr/ct/menu/10136/program/30009/plusSearchResultList.do?searchType=SIMPLE&searchCategory=BOOK&searchKey=TITLE&searchKeyword="+libtxt+"&searchLibraryArr=MA"+libnum).get();
		Elements posts = doc2.body().getElementsByClass("resultList imageType");
		Elements file = posts.select("li");%>

<html>
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>AI대학교_도서관</title>
        <link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
        <!-- Font Awesome icons (free version)-->
        <script src="https://use.fontawesome.com/releases/v5.15.4/js/all.js" crossorigin="anonymous"></script>
        <!-- Google fonts-->
        <link href="https://fonts.googleapis.com/css?family=Lora:400,700,400italic,700italic" rel="stylesheet" type="text/css" />
        <link href="https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800" rel="stylesheet" type="text/css" />
        <!-- Core theme CSS (includes Bootstrap)-->
        <link href="resources/css/styles2.css" rel="stylesheet" />
        
    </head>
    <body>
        <!-- Navigation-->
        <nav class="navbar navbar-expand-lg navbar-light" id="mainNav">
            <div class="container px-4 px-lg-5">
                <a class="navbar-brand" href="http://localhost:8282/main3">AI UNIVERSITY</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
                    Menu
                    <i class="fas fa-bars"></i>
                </button>
                <div class="collapse navbar-collapse" id="navbarResponsive">
                    <ul class="navbar-nav ms-auto py-4 py-lg-0">
                        <li class="nav-item"><a class="nav-link px-lg-3 py-3 py-lg-4" href="http://localhost:8282/lib/libhome.jsp"><h5>LIBRARY</h5></a></li>
                        
                    </ul>
                </div>
            </div>
        </nav>
        <!-- Page Header-->
        <header class="masthead" style="background-image: url('resources/assets/img/lib.jpg')">
            <div class="container position-relative px-4 px-lg-5">
                <div class="row gx-4 gx-lg-5 justify-content-center">
                    <div class="col-md-10 col-lg-8 col-xl-7">
                        <div class="site-heading">
                            <h2>AI 대학 도서관</h2><br/>
                            <div align="center">
								<form action="libhome.jsp" method="get">
									<div class="col"><input class="form-control" type="text" id="libtxt" name="libtxt"></div>
									<br>
									<div class="col-auto"><button class="btn btn-dark" type="submit">도서 검색</button></div>
								</form>
							</div>
                        </div>
                    </div>
                </div>
            </div>
        </header>
        <!-- Main Content-->
        <div class="container px-4 px-lg-5">
            <div class="row gx-4 gx-lg-5 justify-content-center">
                <div class="col-md-10 col-lg-8 col-xl-12">
                	<div class="post-preview">
                		<ul>
							<%for (Element e : file){  %>
								<li style="height:200px;">
									<span style="width:135px;float:left;">
										<img src="<%out.println(e.select(".bookCoverImg").attr("src"));%>" width="125px">
									</span>
									<span class="post-subtitle">
										<h6 class="post-title"><%out.println("1. " + e.select(".tit").text()); %></h2><br>
										<%out.println("2. " + e.select(".author").text()); %><br>
										<%out.println("3. " + e.select(".data").text()); %><br>
										<%out.println("4. " + e.select(".site").text()); %><br>
									</span>
									<br>
								</li>
								<hr class="my-4" />
							<%}%>
						</ul>
                	</div>
                </div>
                
            <div align="center">
	            <div style="position: absolute;">
	            	<%for(int x=1,y=(-62),z=150 ; x<11 ; x++,y+=(-32),z+=(150)){%>
	            	
					<form action="libhome.jsp" method="get" style="position: relative; top:<%out.print(y+61);%>px; left: <%out.print(z-50);%>%;">
						<input type="hidden" id="libtxt" name="libtxt" value="<%out.print(libtxt);%>">
						<input type="hidden" id="libnum" name="libnum" value="&currentPageNo=<%out.print((x)+Integer.parseInt(libcs));%>">
						<input type="hidden" id="libcs" name="libcs" value="<%out.print(Integer.parseInt(libcs));%>">
						<button type="submit" value="<%out.print((x)+Integer.parseInt(libcs));%>" style="background-color:White; border:White;"><%out.print((x)+Integer.parseInt(libcs));%></button>
					</form>
					<%}%>
					
					<form action="libhome.jsp" method="get" style="position: relative; top:-320px; left:-25px;">
						<input type="hidden" id="libtxt" name="libtxt" value="<%out.print(libtxt);%>">
						<input type="hidden" id="libnum" name="libnum" value="<%out.print(libnum);%>">
						<input type="hidden" id="libcs" name="libcs" value="<%if (libcs == null){out.print(Integer.parseInt(libcs));} else if (libcs == "0"){out.print(Integer.parseInt(libcs));} else if ((Integer.parseInt(libcs)) == libcs_sub){out.print(Integer.parseInt(libcs));} else out.print(Integer.parseInt(libcs)-10);%>">
						<button type="submit" value="이전">이전</button>
					</form>
					
					<form action="libhome.jsp" method="get" style="position: relative; top:-360px; left:900px;">
						<input type="hidden" id="libtxt" name="libtxt" value="<%out.print(libtxt);%>">
						<input type="hidden" id="libnum" name="libnum" value="<%out.print(libnum);%>">
						<input type="hidden" id="libcs" name="libcs" value="<%out.print(Integer.parseInt(libcs)+10);%>">
						<button type="submit" value="다음">다음</button>
					</form>
					
				</div>
			</div>
			
            </div>
        </div>
        <!-- Footer-->
        <!-- Bootstrap core JS-->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js"></script>
        <!-- Core theme JS-->
        <script src="resources/js/scripts.js"></script>
    </body>
</html>
