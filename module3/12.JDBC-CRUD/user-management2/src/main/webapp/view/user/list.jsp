<%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 18/02/2022
  Time: 6:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="bootstrap-4.6.1-dist/bootstrap-4.6.1-dist/css/bootstrap.css">
</head>
<body>
<body>
<h1>User List</h1>
<a href="/user?action=add">Add New Product</a>
<div class="container">
    <table class="table table-striped">
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Email</th>
            <th>Country</th>
        </tr>
        <c:forEach items="${userList}" var="user" varStatus="status">
            <tr>
                <td>${user.id}</td>
                <td>${user.name}</td>
                <td>${user.email}</td>
                <td>${user.country}</td>
                <td>
                    <a href="/user?action=delete&id=${user.id}">Delete</a>
                </td>
                <td>
                    <a href="/user?action=edit&id=${user.id}">Edit</a>
                </td>

                <td>
                    <a href="/user?action=view&id=${user.id}">View</a>
                </td>
            </tr>
        </c:forEach>

    </table>
</div>

</body>
</html>
