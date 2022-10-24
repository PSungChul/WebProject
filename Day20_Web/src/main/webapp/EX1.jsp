<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="section4.Computer"%>
<jsp:useBean id="c" class="section4.Computer"> </jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% // 스크립트
		//Computer c = new Computer(); // jsp 액션 태그 객체 생성
		out.println(c.turnOn());
	%>
</body>
</html>