<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>변수 함수 예제</title>
</head>
<body>
	<%! // 전역 변수(필드 변수, 클래스 변수)
	int[] arr = {10, 18, 7};
	int result = arr[0];
	%>
	<%! public void maxNum() {
			for ( int i = 1; i < arr.length; i++ ) {
				if ( result < arr[i] ) {
					result = arr[i];
				}
			}
		}%>
	<% maxNum(); %>
	<%= result %>
	
	<% // a메소드 안에서 쓰던 로직, 지역 변수 선언
	for ( int i = 1; i < arr.length; i++ ) {
		if ( result < arr[i] ) {
			result = arr[i];
		}
	}
	
	out.println(result); // == <%= result
	out.println("<h2>" + result + "<h2>"); // ""큰따옴표 내부는 html세상이므로 태그도 입힐 수 있다.
	%>
</body>
</html>