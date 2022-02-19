<%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 18/02/2022
  Time: 7:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Edit product</h1>
<p>
    <a href="/user">Back to user list</a>
</p>
<form action="/user?action=edit" method="post">
    <table>

        <input type="text" name="id" value="${user.id}">
        <tr>
            <td>Name: </td>
            <td><input type="text" name="name" id="name" value="${user.name}"></td>
        </tr>
        <tr>
            <td>Email: </td>
            <td><input type="text" name="email" id="email" value="${user.email}"></td>
        </tr>
        <tr>
            <td>Country:</td>
            <td><input type="text" name="country" id="country" value="${user.country}"></td>
        </tr>
        <tr>
            <td><input type="submit" value="Update customer"></td>
        </tr>
    </table>
</form>
</body>
</html>
