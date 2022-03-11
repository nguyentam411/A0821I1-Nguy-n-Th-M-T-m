<%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 21/02/2022
  Time: 6:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="jquery-3.6.0.min.js"></script>
    <script src="bootstrap.js"></script>
    <link rel="stylesheet" href="bootstrap-4.6.1-dist/bootstrap-4.6.1-dist/css/bootstrap.css">

</head>
<body>
<h1>Management Product</h1>
<a href="/product?action=add">Add New Product</a>
<form action="/product?action=searchName" method="post">
    <input type="text" name="name" placeholder="Nhập tên">
    <button type="submit">Search</button>
</form>
<form action="/product?action=searchPrice" method="post">
    <input type="text" name="price" placeholder="Price">
    <button type="submit">Search</button>
</form>
<c:if test="${mess!=null}">
    <p>${mess}</p>
</c:if>
<div class="container">
    <table class="table table-striped">
        <tr>
            <th>#</th>
            <th>Product Name</th>
            <th>Price</th>
            <th>Quantity</th>
            <th>Color</th>
            <th>Category</th>
            <th>Action</th>
            <th></th>
        </tr>
        <c:forEach items="${productList}" var="product" varStatus="status">
            <tr>
                <td>${status.count}</td>
                <td>${product.name}</td>
                <td>${product.price}</td>
                <td>${product.quantity}</td>
                    <%--                <td>${product.color}</td>--%>
                <c:forEach items="${colorList}" var="color">
                    <c:if test="${color.id==product.colorId}">
                        <td> ${color.name}</td>
                    </c:if>
                </c:forEach>

                    <%--                <td>${product.categoryId}></td>--%>
                <c:forEach items="${categoryList}" var="category">
                    <c:if test="${category.id==product.categoryId}">
                        <td> ${category.name}</td>
                    </c:if>
                </c:forEach>
                <td>
                        <%--                    <a href="/product?action=delete&id=${product.id}">Delete</a>--%>
                    <a href="/product?action=delete&id=${product.id}">Delete</a>
                </td>
                <td>
                    <a href="/product?action=edit&id=${product.id}">Edit</a>
                </td>
            </tr>
        </c:forEach>

    </table>
</div>
</body>
</html>
