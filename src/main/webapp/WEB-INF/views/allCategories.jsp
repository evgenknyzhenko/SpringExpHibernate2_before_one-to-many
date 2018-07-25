<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Евгений
  Date: 25.07.2018
  Time: 15:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All Categories</title>
</head>
<body>
    <c:forEach var="c" items="${categoriesList}">
        <c:out value="${c.categoryName}"/>
    </c:forEach>
</body>
</html>
