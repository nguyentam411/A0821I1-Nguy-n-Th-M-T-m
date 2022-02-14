<%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 13/02/2022
  Time: 5:17 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Thêm mới sản phẩm</h2>
<form action="/product?action=add" method="post">
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
            <td>Price</td>
            <td><input type="text" name="price" placeholder="Price"></td>
        </tr>
        <tr>
            <td>Description</td>
            <td><input type="text" name="description" placeholder="Description"></td>
        </tr>
        <tr>
            <td>Producer</td>
            <td><input type="text" name="producer" placeholder="Producer"></td>
        </tr>
        <tr>
            <td></td>
            <td><button type="submit">Lưu</button></td>
        </tr>

    </table>
</form>
</body>
</html>
