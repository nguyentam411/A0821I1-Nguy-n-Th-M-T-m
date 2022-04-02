<%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 28/03/2022
  Time: 7:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h3>Customers</h3>
  <p>
    <a th:href="@{/customer/create}">
      Add new customer
    </a>
  </p>

  <table id = "customers">
    <thead>
    <tr>
      <th>Name</th>
      <th>Email</th>
      <th>Address</th>
      <th>Edit</th>
      <th>Delete</th>
      <th>View</th>
    </tr>
    </thead>
    <tbody>
    <tr th:each="row,rowStat : ${customers}">
      <td th:text="${row.getName()}"></td>
      <td th:text="${row.getEmail()}"></td>
      <td th:text="${row.getAddress()}"></td>
      <td><a th:href="@{/customer/{id}/edit(id=${row.getId()})}">edit</a></td>
      <td><a th:href="@{/customer/{id}/delete(id=${row.getId()})}">delete</a></td>
      <td><a th:href="@{/customer/{id}/view(id=${row.getId()})}">view</a></td>
    </tr>
    </tbody>
  </table>

  </body>
</html>
