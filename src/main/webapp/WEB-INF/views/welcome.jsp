<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Евгений
  Date: 23.07.2018
  Time: 9:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
    <h2><c:out value="${user1}"/></h2>
    <button onclick="location.href = '/add'">Add page</button> <br>
    <a href="/">Home Page</a>
</body>
</html>
