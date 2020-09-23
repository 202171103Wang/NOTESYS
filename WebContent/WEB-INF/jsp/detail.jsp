<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*,com.itheima.po.*,com.itheima.service.impl.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%  Note2 note=(Note2)request.getAttribute("note");%>
<body>
作者:<%=note.getUser_name() %><br/>
标题:<%=note.getTitle()%><br/>
正文：<%=note.getMessage() %><br/>
日期：<%=note.getCreate_time()%><br/>
</body>
</html>