<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<%@ include file="partials/navbar.html" %>
<%! String name = "Duncan"; %>
<%= name %>

<c:if test = "${param.name == null}">
    <h1>No parameter of the Name found</h1>
</c:if>

<%--IF / ELSE EQUIVALENT--%>
<c:choose>
    <c:when test = "${param.choice.equals('rock')}">
        <h1>Rock beats Scissors!</h1>
    </c:when>
    <c:otherwise>
        <h1>You Lose!</h1>
    </c:otherwise>
</c:choose>

<%----%>
<%
    String[] nationalParks = {"Rocky Mountain National Park", "Yellowstone National Park", "Big Bend National Park"};
    request.setAttribute("nationalParksArray", nationalParks);
%>
<ul>
<c:forEach items = "${nationalParksArray}" var="nationalPark">
    <li>${nationalPark}</li>
</c:forEach>
</ul>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>
