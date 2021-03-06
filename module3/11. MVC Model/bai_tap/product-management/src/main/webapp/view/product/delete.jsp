<%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 13/02/2022
  Time: 5:45 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Delete product</h1>
<p>
    <a href="/product">Back to product list</a>
</p>
<form action="/product?action=delete" method="post">
    <h3>Are you sure?</h3>
        <table>
            <tr>
                <input type="hidden" name="id" value="${product.id}">
                <td>ID: </td>
                <td>${product.id}</td>
            </tr>
            <tr>
                <td>Name: </td>
                <td>${product.name}</td>
            </tr>
            <tr>
                <td>Price: </td>
                <td>${product.price}</td>
            </tr>
            <tr>
                <td>Description: </td>
                <td>${product.description}</td>
            </tr>
            <tr>
                <td>Producer: </td>
                <td>${product.producer}</td>
            </tr>

            <tr>
                <td><button type="submit">Delete</button></td>
                <td><a href="/product">Back to product list</a></td>
            </tr>
        </table>
</form>
</body>
</html>
