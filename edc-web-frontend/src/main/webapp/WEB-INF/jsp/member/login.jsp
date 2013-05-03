<%--
  User: Sting
  Date: 13-5-3
  Time: 上午9:28
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
    <title></title>
</head>
<body>
    <s:form action="login" method="POST">
        <s:textfield name="name" label="Name"/>
        <s:submit value="Login"/>
    </s:form>
</body>
</html>