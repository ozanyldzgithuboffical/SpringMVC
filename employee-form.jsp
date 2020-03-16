<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
<h1> Spring MVC Form Interaction </h1>
</head>

<body>
    <form:form method="POST" modelAttribute="employee">
    <table>
        <tr>
           <td><label>First Name:</td>
           <td><form:input path="firstName" placeholder="First Name" />
        </tr>

        <tr>
           <td><label>Last Name:</td>
           <td><form:input path="lastName" placeholder="Last Name" />
        </tr>

        <tr>
           <td><label>Email:</td>
           <td><form:input path="email" placeholder="Email" />
        </tr>

        <tr>
           <td><input type="submit" value="Add New Employee"/></td>
        </tr>
    </form:form>
  </body>
</html>
