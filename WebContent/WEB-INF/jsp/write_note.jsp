<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
${name}
!你好
开始写笔记
<form action="${pageContext.request.contextPath}/write_note" method="post">
标题:<input type="text" name="Title" /><br/>
正文：<input type="text" name="Message" /><br/>

<input type="submit" value="提交" />
</form>
<a href="${pageContext.request.contextPath}/main">返回</a>
</body>
</html>