<%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 26/01/2022
  Time: 4:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Product Discount Calculator</title>
  </head>
  <body>
  <form action="/display-discount" method="post">
    <label>Product Description:</label><br>
    <input type="text" name="description"><br>
    <label>List Price</label><br>
    <input type="text" name="price"><br>
    <label>Discount Percent</label><br>
    <input type="text" name="discount_percent"><br>
    <button type="submit" name="calculate_discount">Calculate Discount</button>
  </form>
  </body>
</html>
