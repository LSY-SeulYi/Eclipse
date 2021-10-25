<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<%@page import="com.vision.dto.*" %>
<!DOCTYPE html>
<html>
<head>
<style>
</style>
<meta charset="UTF-8">
<title>LIST</title>
</head>
<body>
<%
   ArrayList<BDto> list = (ArrayList<BDto>)request.getAttribute("list");
%>

<h1 align="center">게시글목록</h1><hr>
   <table border="5" width="500" align="center" style="border-color:pink">
      <tr>
         <th>번호</th>
         <th>게시자</th>
         <th>제목</th>
         <th>게시일자</th>
         <th>조회수</th>
      </tr>
<% 
   for(BDto x:list){
%>
      <tr>
         <td><%=x.getBid() %></td>
         <td><%=x.getBname() %></td>
         <td>
         <%
         	int len = x.getBindent();
         for(int i=0; i<len; i++){
        	 %>&nbsp;&nbsp;&nbsp;
        	 <%
         }
         %>
            <a href="content_view.do?bid=<%=x.getBid() %>"><%=x.getBtitle() %></a>
         </td>
         <td><%=x.getBdate() %></td>
         <td><%=x.getBhit() %></td>
      </tr>
<%    
   }
%>
      <tr>
         <td colspan="5">
            <a href="write_view.do">글작성</a>
         </td>
      </tr>
   </table>
<hr>
   

</body>
</html>