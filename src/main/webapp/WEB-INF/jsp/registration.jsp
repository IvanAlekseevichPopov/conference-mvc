<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
    <h1>Registration!!</h1>
    <form:form modelAttribute="registration">
        <label><spring:message code="name" /></label>
        <form:input path="name" />
        <input type="submit", value="reg">
    </form:form>
</body>
</html>