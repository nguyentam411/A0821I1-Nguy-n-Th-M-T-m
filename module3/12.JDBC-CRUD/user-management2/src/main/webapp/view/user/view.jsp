<%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 18/02/2022
  Time: 7:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>User details</h1>
<p>
    <a href="/user">Back to user list</a>
</p>
<form action="/user?action=view">
    <table>
        <tr>
            <td>ID: </td>
            <td>${user.id}</td>
        </tr>
        <tr>
            <td>Name: </td>
            <td>${user.name}</td>
        </tr>
        <tr>
            <td>Email: </td>
            <td>${user.email}</td>
        </tr>
        <tr>
            <td>Country: </td>
            <td>${user.country}</td>
        </tr>
    </table>
</form>
</body>
</html>
