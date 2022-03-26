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
<form:form action="/update" method="post" modelAttribute="setting">
    <label>Language: </label>
    <select name="languages">
        <option value="Eng">Eng</option>
        <option value="VIN">VIN</option>
        <option value="JPA">JPA</option>
        <option value="CHI">CHI</option>

<%--        <c:forEach items="${languageList}" var="language">--%>
<%--            <option value="${language.id}">${language.name}</option>--%>
<%--        </c:forEach>--%>
    </select>
    <br>
    <label>Page size</label>
    <form:input path="pageSize" />
<%--    <form:input path="pageSize" value="${setting.pageSize}" />--%>
    <br>
    <label>Spam filter</label>
<%--    <form:input path="spamsFilter" type="checkbox" value="${setting.spamsFilter}"/>--%>
    <form:input path="spamsFilter" type="checkbox" />
    <br>
    <label>Signature</label>
    <form:input path="signature" type="text"  />
<%--    <form:input path="signature" type="text" value="${setting.signature}" />--%>
    <br>
    <button>Update</button>
</form:form>
<button><a href="/">Cancel</a></button>
</body>
</html>
