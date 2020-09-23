<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*,com.itheima.po.*,com.itheima.service.impl.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%  Note2 note=(Note2)request.getAttribute("note_up");%>
<body>
<form action="${pageContext.request.contextPath}/update2" method="post">
编号:<input type="text" value="<%=note.getId() %>" name="Id" readonly="readonly"><br/>
标题:<input type="text" value="<%=note.getTitle()%>" name="Title"><br/>
正文：<input type="text" value="<%=note.getMessage() %>" name="Message"><br/>
日期：<input type="text" value="<%=note.getCreate_time()%>" name="create_time" readonly="readonly"><br/>
<input type="submit" value="修改" />
</form>
</body>
</html>