<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String program = request.getParameter("program"); // name값 가져오기
		String nextPage = null; // 페이지값 설정
		
		if ( program.equals("A") ) {
			nextPage = "a.jsp";
		} else if ( program.equals("B") ) {
			nextPage = "b.jsp";
		} else if ( program.equals("C") ) {
			nextPage = "c.jsp";
		} else if ( program.equals("D") ) {
			nextPage = "d.jsp";
		}
	%>
	<jsp:forward page="<%= nextPage %>"></jsp:forward>
</body>
</html>