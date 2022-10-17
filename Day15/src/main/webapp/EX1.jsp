<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EX1.jsp</title>
</head>
<body>
	<%
		String id = request.getParameter("id");
		
		if ( id == "" ) { // jsp에서는 null로 보여도, html에서 넘어올 때는 "" 넘어오더라
			out.println("아이디를 입력하시고 다시 접속하세요.");
		} else {
			out.println(id + "님 환영합니다.");
		}
	%>
</body>
</html>