<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>���� �Լ� ����</title>
</head>
<body>
	<%! // ���� ����(�ʵ� ����, Ŭ���� ����)
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
	
	<% // a�޼ҵ� �ȿ��� ���� ����, ���� ���� ����
	for ( int i = 1; i < arr.length; i++ ) {
		if ( result < arr[i] ) {
			result = arr[i];
		}
	}
		
	out.println(result); // == <%= result
	%>
</body>
</html>