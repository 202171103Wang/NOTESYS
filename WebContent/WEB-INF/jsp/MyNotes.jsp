<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*,com.itheima.po.*,com.itheima.service.impl.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
${name}
!你好
开始查看笔记
<%  
       List<Note2> all_notes2=(List<Note2>)request.getAttribute("myNotes");
     %>
     <%
     if (all_notes2.size()==0)
     {
     %>
     暂时没有写笔记！
     <%}
     else
     {%>
<table>
   <tr>
      <td>标题</td>
      <td>作者</td>
      <td>日期</td>
      <td>操作</td>
     </tr>
     
     <% 
      for(Note2 n2:all_notes2){
     %>
     <tr>
        <td><%=n2.getTitle() %></td>
        <td><%=n2.getUser_name()%></td>
        <td><%=n2.getCreate_time() %></td>
        <td><a href="${pageContext.request.contextPath}/lookin?&Id=<%=n2.getId()%>">查看</a>
        <td><a href="${pageContext.request.contextPath}/update1?&Id=<%=n2.getId()%>">修改</a>
        <td><a href="${pageContext.request.contextPath}/delete?&Id=<%=n2.getId()%>">删除</a>
        </tr>
     <%} %>
        
</table>
<%} %>
<a href="${pageContext.request.contextPath}/main">返回</a>
</body>
</html>