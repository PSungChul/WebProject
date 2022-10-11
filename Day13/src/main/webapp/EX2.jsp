<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>EX2</title>
</head>
<body>
	<%! String name = "sungchul"; %>
	<%! int n1 = 1; 
		int n2 = 2; %>
	<%! int n3 = 3; %>
	<%! public int plus(int a, int b, int c) {
			return a+b+c;
		}%>
	
	<p><u><%= name %></u></p>
	<%= plus(n1, n2, n3) %>
</body>
</html>