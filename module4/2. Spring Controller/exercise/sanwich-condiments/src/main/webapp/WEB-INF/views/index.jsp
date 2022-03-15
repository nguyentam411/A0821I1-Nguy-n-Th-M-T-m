<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 14/03/2022
  Time: 7:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1>Sanwich Condiments</h1>
  <form action="/save" method="post">
    <input type="checkbox" value="Lectuce" name="condiment">Lectuce
    <input type="checkbox" value="Tomato" name="condiment">Tomato
    <input type="checkbox" value="Mustard" name="condiment">Musstard
    <input type="checkbox" value="Sprouts" name="condiment">Sprouts
    <button>Save</button>
  </form>
  <h1>Condiment:${result}</h1>
  </body>
</html>
