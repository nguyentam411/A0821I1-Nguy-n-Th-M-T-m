<%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 26/01/2022
  Time: 6:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="/discount" method="post">
    <label>Description</label><br>
    <input name="description" ><br>
    <label>Price</label><br>
    <input name="price" type="text"><br>
    <label>Discount</label><br>
    <input name="discount" ><br>
    <button type="submit">calculate</button>
  </form>
  </body>
</html>
