<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<%--Bootstrap Form--%>
<%@ include file="partials/form.html" %>

<%--Check for admin and password--%>
<c:choose>
    <c:when test="${param.floatingInput.equalsIgnoreCase('admin') && param.floatingPassword.equalsIgnoreCase('password')}">
        <%response.sendRedirect("/profile.jsp");%>
    </c:when>
    <c:otherwise>
        <c:if test="${param.floatingInput != null && param.floatingPassword != null}">
            <%response.sendRedirect("/login.jsp");%>
        </c:if>
    </c:otherwise>
</c:choose>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>
