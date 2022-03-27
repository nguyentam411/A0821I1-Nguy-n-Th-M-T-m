<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 18/03/2022
  Time: 8:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Settings</title>
</head>
<body>
<h1>Setting</h1>

<form:form action="/update" method="post" modelAttribute="setting">
    <label>Language: </label>
    <form:select path="languages">
        <form:option value="Eng">Eng</form:option>
        <form:option value="VIN">VIN</form:option>
        <form:option value="JPA">JPA</form:option>
        <form:option value="CHI">CHI</form:option>
    </form:select>
    <br>
    <label>Page size</label>
    Show
    <form:select path="pageSize">
        <form:option value="5">5</form:option>
        <form:option value="10">10</form:option>
        <form:option value="15">15</form:option>
        <form:option value="20">20</form:option>
    </form:select>
<%--    <form:input path="pageSize" />--%>
    <br>
    <label>Spams filter</label>
    <form:checkbox path="spamsFilter" value="true"/>
    Enable spams filter
    <br>
    <label>Signature</label>
    <form:textarea path="signature"></form:textarea>
    <br>
    <button>Update</button>
    <button type="button">Cancel</button>
</form:form>
</body>
</html>
