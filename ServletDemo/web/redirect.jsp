<%--
  Created by IntelliJ IDEA.
  User: 月月
  Date: 2020/11/30
  Time: 21:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String message = (String) request.getAttribute("message");
%>
<html>
<head>
    <title>redirect</title>
</head>
<body>
<h1>this is redirect</h1>
<%=message%>
</body>
</html>