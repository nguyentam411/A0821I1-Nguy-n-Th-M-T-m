<%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 13/02/2022
  Time: 12:18 AM
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
<h1>Product List</h1>
<a href="/product?action=add">Add New Product</a>
<div class="container">
    <table class="table table-striped">
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Price</th>
            <th>Description</th>
            <th>Producer</th>
            <th>Action</th>
        </tr>
        <c:forEach items="${productList}" var="product" varStatus="status">
            <tr>
                <td>${product.id}</td>
                <td>${product.name}</td>
                <td>${product.price}</td>
                <td>${product.description}</td>
                <td>${product.producer}></td>
                <td>
                    <a href="/product?action=delete">Delete</a>
                </td>
                <td>
                    <a href="/product?action=view">View</a>
                </td>
            </tr>
        </c:forEach>

    </table>
</div>
</body>
</html>
