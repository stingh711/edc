<%--
  User: Sting
  Date: 13-5-3
  Time: 上午9:28
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>
<!DOCTYPE html>
<html>
<head>
    <sb:head/>
    <title></title>
</head>
<body>
    <s:form action="login" method="POST">
        <s:textfield name="name" label="Name"/>
        <s:submit value="Login" cssClass="btn"/>
    </s:form>
</body>
</html>