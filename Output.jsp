<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="Output.css">
<meta charset="UTF-8">
<title>結果出力ページ</title>
</head>
<body>
<p>入力した数値は<%= request.getAttribute("Outputdata") %></p>
<br>
<a href=http://localhost:8080/Test3/Input.jsp>戻る</a>
</body>
</html>