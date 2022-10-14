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
		String num = request.getParameter("num"); // input의 기본타입 --> String
		int inum = Integer.parseInt(num); // Integer.parseInt --> String을 int로 변환
		
		if ( inum >= 10 ) {
			out.println("<script>alert('10보다 크거나 같습니다.')</script>");
		} else {
			out.println("<script>alert('10보다 작습니다.')</script>");
		}
	%>
</body>
</html>