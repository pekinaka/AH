<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>メンバ情報登録画面</title>
</head>
<body>
メンバ情報を入力してください。<br>
<form method="post" action="./EntryInfo">
氏名：<input type ="text" name="name"><br>
代：<input type = "text" name="year"><br>
パスワード：<input type = "password" name ="password"><br>
<input type = "submit" value ="登録">
</form>
</body>
</html>