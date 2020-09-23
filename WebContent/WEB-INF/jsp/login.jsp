<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
欢迎登陆！
<a href="${pageContext.request.contextPath}/register">注册</a>
<form action="${pageContext.request.contextPath}/login" method="Post">
账号:<input type="text" name="Id" /><br/>
密码:<input type="password" name="password"/><br/>
<input type="submit" value="登陆" />
</form>
</body>
</html>