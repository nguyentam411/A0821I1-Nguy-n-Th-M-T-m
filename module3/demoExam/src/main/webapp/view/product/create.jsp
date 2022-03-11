<%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 24/02/2022
  Time: 9:47 PM
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
<h2>Add new product</h2>
<form action="/product?action=add" method="post">
    <table>
<%--        <tr>--%>
<%--            <td>ID</td>--%>
<%--            <td><input type="text" name="id" placeholder="ID"></td>--%>
<%--        </tr>--%>
        <tr>
            <td>Name</td>
            <td><input type="text" name="name" placeholder="Name"></td>
        </tr>
        <tr>
            <td>Price</td>
            <td><input type="text" name="price" placeholder="Price"></td>
        </tr>
        <tr>
            <td>Quantity</td>
            <td><input type="text" name="quantity" placeholder="Quantity"></td>
        </tr>
        <tr>
            <td>Color</td>
<%--            <td><input type="text" name="color" placeholder="Color"></td>--%>
            <td>
                <select name="colorId">
                    <c:forEach items="${colorList}" var="color2">
                        <option value="${color2.id}">${color2.name}</option>
                    </c:forEach>
                </select>
            </td>

        </tr>
<%--        <tr>--%>
<%--            <td>CategoryId</td>--%>
<%--            <td><input type="text" name="categoryId" placeholder="Category"></td>--%>
<%--        </tr>--%>
        <tr>
            <td>Category</td>
            <td>
                <select name="categoryId">
                    <c:forEach items="${categoryList}" var="category2">
                        <option value="${category2.id}">${category2.name}</option>
                    </c:forEach>
                </select>
            </td>
        </tr>
        <tr>
            <td><button type="submit">Lưu</button></td>
        </tr>

    </table>
</form>


</body>
</html>
