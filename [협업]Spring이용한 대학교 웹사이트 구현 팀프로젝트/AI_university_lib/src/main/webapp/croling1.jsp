<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">

	<!-- Bootstrap core JS-->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js"></script>
    <!-- Core theme JS-->
    <script src="resources/js/scripts.js"></script>

</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <div class="container">
            <a class="navbar-brand" href="#">XX 대학교</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation"><span class="navbar-toggler-icon"></span></button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav ms-auto mb-2 mb-lg-0">
                    <li class="nav-item"><a class="nav-link active" aria-current="page" href="http://localhost:8282/jspcroling/libmain.jsp">Home</a></li>
                </ul>
            </div>
        </div>
    </nav>
	
	<div align="center">
		<form action="croling1.jsp" method="get">
			<input type="text" id="libtxt" name="libtxt">
			<input type="submit" value="도서 검색">
		</form>
	</div>
	
<% String libtxt = request.getParameter("libtxt");%>
<% String libnum = request.getParameter("libnum");%>
<% if (libnum == null){libnum = "&currentPageNo=1";};%>

	<%
	String libXXX = "img.logo_sta";
		Document doc2 = Jsoup.connect("https://www.snlib.go.kr/ct/menu/10136/program/30009/plusSearchResultList.do?searchType=SIMPLE&searchCategory=BOOK&searchKey=TITLE&searchKeyword="+libtxt+"&searchLibraryArr=MA"+libnum).get();
		Elements posts = doc2.body().getElementsByClass("resultList imageType");
		Elements file = posts.select("li");
		
	%><ul>
	<%for (Element e : file){  %>
		<li style="height:200px;">
			<span style="width:135px;float:left;">
				<img src="<%out.println(e.select(".bookCoverImg").attr("src"));%>" width="100px">
			</span>
			
			<span class="font-weight-bold font-italic">
				<%out.println("1. " + e.select(".tit").text()); %><br>
				<%out.println("2. " + e.select(".author").text()); %><br>
				<%out.println("3. " + e.select(".data").text()); %><br>
				<%out.println("4. " + e.select(".site").text()); %><br>
			</span>
			<br>
		</li>
	<%}%>
	</ul>
	<div class="row justify-content-center">
		
		<form action="croling1.jsp" method="get">
			<input type="hidden" id="libtxt" name="libtxt" value="<%out.print(libtxt);%>">
			<input type="hidden" id="libnum" name="libnum" value="&currentPageNo=1">
			<input type="submit" value="1" style="background-color:White; border:White;">
		</form>
		&nbsp;&nbsp;
		<form action="croling1.jsp" method="get">
			<input type="hidden" id="libtxt" name="libtxt" value="<%out.print(libtxt);%>">
			<input type="hidden" id="libnum" name="libnum" value="&currentPageNo=2">
			<input type="submit" value="2" style="background-color:White; border:White;">
		</form>
		&nbsp;&nbsp;
		<form action="croling1.jsp" method="get">
			<input type="hidden" id="libtxt" name="libtxt" value="<%out.print(libtxt);%>">
			<input type="hidden" id="libnum" name="libnum" value="&currentPageNo=3">
			<input type="submit" value="3" style="background-color:White; border:White;">
		</form>
		&nbsp;&nbsp;
		<form action="croling1.jsp" method="get">
			<input type="hidden" id="libtxt" name="libtxt" value="<%out.print(libtxt);%>">
			<input type="hidden" id="libnum" name="libnum" value="&currentPageNo=4">
			<input type="submit" value="4" style="background-color:White; border:White;">
		</form>
		&nbsp;&nbsp;
		<form action="croling1.jsp" method="get">
			<input type="hidden" id="libtxt" name="libtxt" value="<%out.print(libtxt);%>">
			<input type="hidden" id="libnum" name="libnum" value="&currentPageNo=5">
			<input type="submit" value="5" style="background-color:White; border:White;">
		</form>
		
	</div>
</body>

</html>
