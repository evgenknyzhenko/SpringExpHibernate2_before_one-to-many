<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Евгений
  Date: 25.07.2018
  Time: 14:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>AddCategory</title>
</head>
<body>
    <%--@elvariable id="category" type="app.model.Category"--%>
    <spring:form modelAttribute="category">
        <h3>Enter Category Name</h3>
        <spring:input path="categoryName" type="text" />

        <button type="submit">Submit</button>
    </spring:form>
</body>
</html>
