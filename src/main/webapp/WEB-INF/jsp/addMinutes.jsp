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
<script type="text/javascript" src="jquery-1.8.3.js"></script>
<script type="text/javascript">
    $(document).ready(
        function() {
            $.getJSON('<spring:url value="activities.json"/>', {
                ajax : 'true'
            }, function(data){
                var html = '<option value="">--Please select one--</option>';
                var len = data.length;
                for (var i = 0; i < len; i++) {
                    html += '<option value="' + data[i].desc + '">'
                    + data[i].desc + '</option>';
                }
                html += '</option>';
                $('#activities').html(html);
            });
        });
</script>
</head>
<body>
<h1>Add Minutes Exercised</h1>

Language : <a href="?language=en">English</a> | <a href="?language=es">Spanish</a>
<form:form commandName="exercise">
    <table>
        <tr>
            <td><spring:message code="goal.text" /></td>
            <td><form:input path="minutes"/></td>
            <td>
                <form:select path="activity" id="activities"></form:select>
            </td>
        </tr>
        <tr>
            <td colspan="3"><input type="submit" value="Enter Exercise"></td>
            <td></td>
        </tr>
    </table>
</form:form>

<h1>Our goal for the day is: ${goal.minutes}</h1>

</body>
</html>
