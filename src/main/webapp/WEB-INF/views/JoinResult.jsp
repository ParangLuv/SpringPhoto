<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
		이름 : ${user.userName}<br>
		아이디 : ${user.userId}<br>
		비밀번호 : ${user.userPw}<br>
		이메일 : ${user.userEmail}<br>
		전화번호 : ${user.userPhone}<br>
	<a href="/login">확인</a>
</body>
</html>