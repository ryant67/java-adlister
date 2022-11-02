<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form method="POST" action="/login.jsp">
    <label for="username">Username:</label>
    <input id="username" name="username" placeholder="Enter your Username"/>
    <label for="password">Password:</label>
    <input id="password" name="password" placeholder="Enter your Password"/>
</form>

<c:choose>
    <c:when test="">
        
    </c:when>
</c:choose>


</body>
</html>
