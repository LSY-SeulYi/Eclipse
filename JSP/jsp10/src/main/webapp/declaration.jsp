<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!
		int age = 19;
		String name = "순이";

		public String dispLine(int size,String buho) {
			String line = "";
			for (int i=0;i<size;i++) {
				line += buho;
			}
			return line;
		}
	%>
	
	<%
		// 구구단 출력
		out.println(dispLine(40,"★"));
		out.println("<br>");
		
		for(int i=1;i<=9;i++) {
			out.println(9+"*"+i+"="+(9*i)+"<br>");
			if (i==5){
				%>
			이 자리는 html코드 자리<br>
				<%
			}
		}
		out.println(name+"은 구구단을 못외웠어요!<br>");
		out.println("나이는 "+age+"인데도 말입니다.<br>");
		out.println(dispLine(40,"★"));
	%>

	<hr>
	<p></p>
	<%=dispLine(30,"★☆") %>
	<br>.....
	
</body>
</html>