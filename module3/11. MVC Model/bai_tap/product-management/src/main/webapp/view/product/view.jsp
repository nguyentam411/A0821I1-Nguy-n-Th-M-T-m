<%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 13/02/2022
  Time: 6:30 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Customer details</h1>
<p>
    <a href="/product">Back to customer list</a>
</p>
<form action="/product?action=view">
<table>
    <tr>
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
</table>
</form>
</body>
</html>
