<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<input type="hidden" name="cmd" value="index2">
	
	<form action="/01_servlet/Home" method="post">
		<input type="submit" value="로그인">
		<input type="hidden" name="cmd" value="login2">
	</form>
	
	<form action="/01_servlet/Home" method="post">
		<input type="submit" value="회원가입">
		<input type="hidden" name="cmd" value="signup2">
	</form>
	
	<form action="/01_servlet/Home" method="post">
		<input type="submit" value="마이페이지">
		<input type="hidden" name="cmd" value="pwdchk">
		<input type="hidden" name="pwd" value="${mvo.pwd}">
		<input type="hidden" name="id" value="${mvo.id}">
	</form>
</body>
</html>