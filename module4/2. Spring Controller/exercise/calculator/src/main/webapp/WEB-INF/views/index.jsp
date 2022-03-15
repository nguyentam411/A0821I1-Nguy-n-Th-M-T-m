<%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 14/03/2022
  Time: 8:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Calculator</title>
  </head>
  <body>
  <h1>Calculator</h1>
  <form action="/result" method="post">
  <input name="num1">
  <input name="num2">
    <input type="submit" value="add" name="calculation">
    <input type="submit" value="sub" name="calculation">
    <input type="submit" value="mul" name="calculation">
    <input type="submit" value="div" name="calculation">
  <h1>Result ${calculation}: ${result}</h1>
  </form>
  </body>
</html>
