<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/register" method="Post">
用户名:<input type="text" name="name" /></br>
密码:<input type="password" name="password" /></br>
班级:<input type="text" name="classname" /></br>
<input type="submit" value="注册" />
</form>
</body>
</html>