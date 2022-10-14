<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>UPLOAD</title>
<style>
	ul {
		padding-left: 0;
		list-style: none;
		
		border-style: solid;
		border-width: 1px;
		border-color: #0097a7;
		width: auto;
		height: auto;
		padding: 5px;
		box-sizing: content-box;
		
		position: absolute;
		top: 18%;
		left: 50%;
		transform: translate(-50%, -50%);
	}
</style>
</head>
<body>
	<ul>
		<%
			String title = request.getParameter("title");
			String date = request.getParameter("date");
			String content = request.getParameter("content");
			out.println("<li>" + "제목 : " + title + "</li>");
			out.println("<li>" + "날짜 : " + date + "</li>");
			out.println("<li>" + "내용" + "</li>");
			out.println("<li>" + content + "</li>");
		%>
	</ul>
</body>
</html>