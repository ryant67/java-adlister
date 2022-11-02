<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form method="POST" action="${pageContext.request.contextPath}/login.jsp">
    <label for="username">Username:</label>
    <input id="username" name="username" placeholder="Enter your Username"/>
    <label for="password">Password:</label>
    <input id="password" name="password" placeholder="Enter your Password"/>
</form>

<c:choose>
    <c:when test="${param.username.equals('admin')} && ${param.password.equals('password')}">
        <h1>It works.</h1>
    </c:when>
    <c:otherwise>
        <h1>It does not work.</h1>
    </c:otherwise>
</c:choose>


<%--<c:choose>--%>
<%--    IF--%>
<%--    <c:when test = "${param.choice.equals('rock')}">--%>
<%--        <h1>Rock beats Scissors!</h1>--%>
<%--    </c:when>--%>
<%--    ELSE--%>
<%--    <c:otherwise>--%>
<%--        <h1>You Lose!</h1>--%>
<%--    </c:otherwise>--%>
<%--</c:choose>--%>


</body>
</html>
