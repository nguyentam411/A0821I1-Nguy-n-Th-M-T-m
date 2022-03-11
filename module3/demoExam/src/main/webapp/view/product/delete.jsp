<%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 25/02/2022
  Time: 1:18 PM
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
<h1>Delete product</h1>
<p>
    <a href="/product">Back to product list</a>
</p>
<form action="/product?action=delete" method="post">
    <h3>Are you sure?</h3>
    <table >
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
            <td>Quantity: </td>
            <td>${product.quantity}</td>
        </tr>
        <tr>
            <td>Color: </td>
            <c:forEach items="${colorList}" var="color">
                <c:if test="${color.id==product.colorId}">
                    <td> ${color.name}</td>
                </c:if>
            </c:forEach>
        </tr>
        <tr>
            <td>Category: </td>
            <c:forEach items="${categoryList}" var="category">
                <c:if test="${category.id==product.categoryId}">
                    <td> ${category.name}</td>
                </c:if>
            </c:forEach>
        </tr>

        <tr>
            <td>
                <button type="submit">Delete</button>
            </td>
        </tr>
    </table>
</form>

</body>
</html>
