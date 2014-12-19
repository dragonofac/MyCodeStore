<%--
  Created by IntelliJ IDEA.
  User: mzlin
  Date: 14-12-18
  Time: 下午7:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
  <base href="<%=basePath%>">

  <title>My JSP 'index.jsp' starting page</title>
  <meta http-equiv="pragma" content="no-cache">
  <meta http-equiv="cache-control" content="no-cache">
  <meta http-equiv="expires" content="0">
  <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
  <meta http-equiv="description" content="This is my page">
  <%--<link rel="stylesheet" type="text/css" href="styles.css">--%>
</head>

<body>
<br>This is my JSP page.<br>
<h2>Add Book</h2>
<form method="post" action="<%=request.getContextPath() %>/book.do?method=add">
  BookName:<input type="text" name="name" id="name">
  Author:<input type="text" name="author" id="author">
  ISBN:<input type="text" name="isbn" id="isbn">
  <input type="submit" value="Add">
</form>

<h2>Search Book</h2>
<form method="post" action="<%=request.getContextPath() %>/book.searchbyauthor">
  Author:<input type="text" name="author" id="author">
  <input type="submit" value="Search author">
</form>

<h2>Search Book</h2>
<form method="post" action="<%=request.getContextPath() %>/book.do?method=searchbyname">
  BookName:<input type="text" name="name" id="name">
  <input type="submit" value="Search name">
</form>

</body>
</html>
