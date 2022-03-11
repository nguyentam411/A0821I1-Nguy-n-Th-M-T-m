<%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 25/02/2022
  Time: 6:00 PM
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
    <a href="/product">Back to product list</a>
</p>
<form action="/product?action=edit" method="post">
    <table>

        <input type="hidden" name="id" value="${product.id}">
        <tr>
            <td>Name:</td>
            <td><input type="text" name="name" id="name" value="${product.name}"></td>
        </tr>
        <tr>
            <td>Price:</td>
            <td><input type="text" name="price" id="price" value="${product.price}"></td>
        </tr>
        <tr>
            <td>Quantity:</td>
            <td><input type="text" name="quantity" id="quantity" value="${product.quantity}"></td>
        </tr>
        <tr>
            <td>Color:</td>
            <td>
                <select name="colorId">
                    <c:forEach items="${colorList}" var="color">
                        <option value="${color.id}">${color.name}</option>
                    </c:forEach>
                </select>
            </td>
        </tr>
        <tr>
            <td>Category</td>
            <td>
                <select name="categoryId">
                    <c:forEach items="${categoryList}" var="category">
                        <option value="${category.id}">${category.name}</option>
                    </c:forEach>
                </select>
            </td>
        </tr>

        <tr>
            <td><input type="submit" value="Update product"></td>
        </tr>
    </table>
</form>

</body>
</html>
