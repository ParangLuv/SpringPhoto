<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="join"  method="post">
		이름 : <input type="text" name="userName"><br>
		아이디 : <input type="text" name="userId"><br>
		비밀번호 : <input type="password" name="userPw"><br>
		이메일 : <input type="text" name="userEmail"><br>
		전화번호 : 
		
		<select name="userPhone1">
			<option value=010>010</option>
			<option value=011>011</option>
			<option value=016>016</option>
			<option value=017>019</option>
		</select>
		- <input type="number" name="userPhone2"> - <input type="number" name="userPhone3">
		<br>
		<input type="submit" value="회원가입">
	</form>
</body>
</html>