<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 18/03/2022
  Time: 8:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Setting</h1>
<form:form action="/setting" method="post">
    <label>Language</label>
    <form:select path="language" items=""/>
    <label>Page size</label>
    <form:select path="pageSize" items=""/>
    <label>Spam filter</label>
    <form:checkbox path="spamFilter"/>
    <label>Signature</label>
    <form:textarea path="sign"></form:textarea>
    <button>Update</button>
    <button><a href="">Cancel</a></button>
    <h1>abc</h1>
</form:form>
<h1>abc</h1>
</body>
</html>
