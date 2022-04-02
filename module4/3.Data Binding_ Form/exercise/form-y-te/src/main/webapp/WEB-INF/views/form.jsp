<%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 28/03/2022
  Time: 7:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<h2>Tờ khai y tế</h2>
<form:form>
    <label>Họ tên (ghi chữ IN HOA):</label>
    <form:input path="name"/>
    <br>
    <label>Năm sinh: </label>
    <form:input path="birthYear"/>
    <label>Số CMND</label>
    <form:textarea path="cmnd"></form:textarea>
    <label></label>
</form:form>
</body>
</html>
