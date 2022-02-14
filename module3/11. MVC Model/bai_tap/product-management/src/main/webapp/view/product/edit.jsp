<%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 14/02/2022
  Time: 7:25 PM
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
    <a href="/product">Back to customer list</a>
</p>
<form action="/product?action=edit" method="post">
    <table>

        <input type="text" name="id" value="${product.id}">
        <tr>
            <td>Name: </td>
            <td><input type="text" name="name" id="name" value="${product.name}"></td>
        </tr>
        <tr>
            <td>Price: </td>
            <td><input type="text" name="price" id="price" value="${product.price}"></td>
        </tr>
        <tr>
            <td>Description:</td>
            <td><input type="text" name="description" id="description" value="${product.description}"></td>
        </tr>
        <tr>
            <td>Producer:</td>
            <td><input type="text" name="producer" id="producer" value="${product.producer}"></td>
        </tr>

        <tr>
            <td></td>
            <td><input type="submit" value="Update customer"></td>
        </tr>
    </table>
</form>
</body>
</html>
