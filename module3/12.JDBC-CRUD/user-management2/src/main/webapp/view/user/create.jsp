<%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 18/02/2022
  Time: 7:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Add new user</h2>
<form action="/user?action=add" method="post">
    <table>
        <tr>
            <td>ID</td>
            <td><input type="text" name="id" placeholder="ID"></td>
        </tr>
        <tr>
            <td>Name</td>
            <td><input type="text" name="name" placeholder="Name"></td>
        </tr>
        <tr>
            <td>Email</td>
            <td><input type="text" name="email" placeholder="Email"></td>
        </tr>
        <tr>
            <td>Country</td>
            <td><input type="text" name="country" placeholder="Country"></td>
        </tr>
        <tr>
            <td><button type="submit">Lưu</button></td>
        </tr>

    </table>
</form>

</body>
</html>
