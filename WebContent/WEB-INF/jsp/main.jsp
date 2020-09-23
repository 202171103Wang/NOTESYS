<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
${name}欢迎登陆！
<a href="${pageContext.request.contextPath}/write_note">写笔记</a>
<a href="${pageContext.request.contextPath}/read_note">查看全部笔记</a>
<a href="${pageContext.request.contextPath}/selectMyNotes">查看我的笔记</a>
<a href="${pageContext.request.contextPath}/login">退出</a>
</body>
</html>