<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
 
<html>
<head>
    <title>Add Employee Form</title>
    <style>
    .error 
    {
        color: red;
        font-weight:bold;
    }
    </style>
</head>
 
<body>
    <form:form method="post" modelAttribute="employee">
        
        <%-- <form:errors path="*" cssClass="error" /> --%>
        <table>
            <tr>
                <td><label>First Name:</label></td>
                <td><form:input path="firstName" /></td>
                <td><form:errors path="firstName" cssClass="error" /></td>
            </tr>
            <tr>
                <td><label>Last Name</label></td>
                <td><form:input path="lastName" /></td>
                <td><form:errors path="lastName" cssClass="error" /></td>
            </tr>
            <tr>
                <td><label>Email:</label></td>
                <td><form:input path="email" /></td>
                <td><form:errors path="email" cssClass="error" /></td>
            </tr>
            <tr>
                <td><input type="submit" value="Add New Employee"/></td>
            </tr>
        </table>
    </form:form>
</body>
</html>
