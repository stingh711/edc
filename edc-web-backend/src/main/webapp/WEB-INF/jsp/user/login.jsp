<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 13-5-9
  Time: 下午3:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title></title>
</head>
<body>
    <sf:form action="/login" method="post" modelAttribute="user">
        <label for="email"><s:message code="user.email.label"/>:</label><br>
        <sf:input path="email" id="email"/><br>
        <label for="password"><s:message code="user.password.label"/>:</label><br>
        <sf:password path="password" id="password"/><br>
        <input type="submit" value="Login"/>
    </sf:form>
</body>
</html>