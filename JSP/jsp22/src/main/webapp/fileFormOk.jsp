<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@ page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page import="java.util.*"%>
<%
	String path = request.getRealPath("fileFolder");
	int size = 1024 * 1024 * 10; // 10M
	String file = "";
	String oriFile = "";
	
	try{
	MultipartRequest mrequest = new MultipartRequest(request,path,size,"utf-8",new DefaultFileRenamePolicy());
	Enumeration<String> files = mrequest.getFileNames();	// 복수개로 파일을 가져올수 있게 했다.
	String str = files.nextElement();
	file = mrequest.getFilesystemName(str);
	oriFile = mrequest.getOriginalFileName(str);
	} catch (Exception e) {
		e.printStackTrace();
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>파일 업로드에 성공하였습니다~!</h1><hr>
</body>
</html>