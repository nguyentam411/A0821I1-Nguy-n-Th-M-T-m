<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 18/03/2022
  Time: 8:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Setting</h1>
<form:form action="/update" method="post">
    <label>Language: </label>
    <%--    <form:select path="language" items=""/>--%>
    <select name="languageId">
        <c:forEach items="${languageList}" var="language">
            <option value="${language.id}">${language.name}</option>
        </c:forEach>
    </select>
    <br>
    <label>Page size</label>
    <input path="pageSize" value="${setList.get(0).pageSize}">
    <br>
    <label>Spam filter</label>
    <input name="spamFilter" type="checkbox" value="${setList.get(0).spamsFilter}">
    <br>
    <label>Signature</label>
    <input name="sign" type="text" value="${setList.get(0).signature}">
    <br>
    <button>Update</button>
</form:form>
<button><a href="/home">Cancel</a></button>
</body>
</html>
