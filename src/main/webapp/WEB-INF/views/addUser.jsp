<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
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
    <title>Add user</title>
</head>
<body>
<div class="container">
    <%--@elvariable id="user" type="app.model.User"--%>
    <spring:form  modelAttribute="user">
        <h3>Enter name</h3>
        <spring:input path="name" type="name"/>
        <h4>Enter description</h4>
        <spring:input path="description" type="text"/>

        <button type="submit">Submit</button>
    </spring:form>
</div>
</body>
</html>
