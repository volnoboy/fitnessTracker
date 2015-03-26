<%--
  Created by IntelliJ IDEA.
  User: volnoboy
  Date: 3/26/15
  Time: 6:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Add Goal</title>
</head>
<body>
<form:form commandName="goal">
    <table>
        <tr>
            <td>Enter Minutes:</td>
            <td><form:input path="minutes"/></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="Enter Goal Minutes"/></td>
        </tr>
    </table>
</form:form>
</body>
</html>
