<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="Errorpage.css">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p><%= request.getAttribute("Outputdata") %></p>
<br>
<a href=http://localhost:8080/Test3/Input.jsp>戻る</a>
</body>
</html>