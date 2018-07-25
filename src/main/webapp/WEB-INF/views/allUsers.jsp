<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Евгений
  Date: 20.07.2018
  Time: 17:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All Users</title>
</head>
<body>
    <c:forEach var="c" items="${list}">
        <a href="/user?c_name=${c.name}"><c:out value="${c.name}"/></a><br/>
    </c:forEach>
</body>
</html>
