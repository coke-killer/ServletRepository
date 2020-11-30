<%--
  Created by IntelliJ IDEA.
  User: 月月
  Date: 2020/11/30
  Time: 21:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--jsp内置对象result--%>
<%--向jsp传递参数用attribute--%>
<%
    String result = (String) request.getAttribute("message");
%>
<html>
<head>
    <title>forward</title>
</head>
<body>
<h1>这是转发页面</h1>
<%=result%>
</body>
</html>
