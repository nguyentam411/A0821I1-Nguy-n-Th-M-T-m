<%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 21/02/2022
  Time: 5:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/user?action=find_by_country" method="post">
        <table>
            <tr>
                <td>Country</td>
                <td><input type="text" name="country" placeholder="country"></td>
            </tr>
            <tr>
                <td><button type="submit">Lưu</button></td>
            </tr>
        </table>
</form>
</body>
</html>
