<%--
  Created by IntelliJ IDEA.
  User: volnoboy
  Date: 3/18/15
  Time: 7:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Minutes</title>
</head>
<body>
<h1>Add Minutes Exercised</h1>
<form:form commandName="exercise">
    <table>
        <tr>
            <td><spring:message code="goal.text" /></td>
            <td><form:input path="minutes"/></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="Enter Exercise"></td>
            <td></td>
        </tr>
    </table>
</form:form>
</body>
</html>
