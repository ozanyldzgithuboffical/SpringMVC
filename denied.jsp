<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
    <body>
     
        <h1>Unauthorized Access !!</h1>
     
        <hr />
     
        <c:if test="${not empty error}">
            <div style="color:red">
                You are not authorized<br /> 
            </div>
        </c:if>
     
        <p class="message">Access denied!</p>
        <a href="your-url">Go back to login page</a> 
    </body>
</html>
