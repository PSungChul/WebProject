<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.sql.Connection" %>
<%@ page import = "java.sql.DriverManager" %>
<%@ page import = "java.sql.ResultSet" %>
<%@ page import = "java.sql.SQLException" %>
<%@ page import = "java.sql.Statement" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!
		Connection conn; // 자바와 DB를 연결해줄 통로
		Statement stmt; // sql을 감싸주는 캡슐 - 기본
		ResultSet rs; // 값을 받는 용도
		
		String url = "jdbc:mysql://localhost:3306/test"; // mysql "test" DB 주소
	%>
	<% // DB 연결
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // mysql-DBconnector 라이브러리의 Driver 클래스 파일 이름
			out.println("<p>" + "Driver 로딩 성공" + "</p>"); // 확인용 메세지
		
			conn = DriverManager
					.getConnection(url, "root", "46281379"); // 연결 시작
			out.println("<p>" + "DB 접속 성공" + "</p>"); // 확인용 메세지
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	%>
	<%
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM testTable");
		
			while(rs.next()) { // 다음 행 있어?
				out.println("<p>" + rs.getInt("id") + " " + rs.getString("name") + "</p>");
			}
		
			rs.close();
			stmt.close();
			conn.close();
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
	%>
</body>
</html>