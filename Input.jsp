<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="Input.css">
<meta charset="UTF-8">
<title>入力ページ</title>
</head>
<body>
<form method="GET" action="Servlet">
        <hi>奇数・偶数判定ページ</hi>
        <br>
        <!-- 数字の入力 -->
        数値入力（半角）:<input type="text" name="Number"><br>
        <!-- 送信ボタン -->
        <input type="submit" value="判定ボタン"><br>
    </form>

</body>
</html>