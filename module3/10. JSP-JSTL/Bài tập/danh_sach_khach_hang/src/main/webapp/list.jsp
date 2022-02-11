<%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 11/02/2022
  Time: 6:39 PM
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
<h1>Customer List</h1>
<table class="table table-striped">
    <tr >
        <th>Name</th>
        <th>Birthday</th>
        <th>Addrress</th>
        <th>Img</th>
    </tr>
    <c:forEach items="${customerList}" var="customer" varStatus="status">
        <tr>
            <td>${customer.name}</td>
            <td>${customer.birthday}</td>
            <td>${customer.address}</td>
            <td><img src="${customer.imgUrl}"></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
