<%--
  Created by IntelliJ IDEA.
  User: Philipp Schweiger
  Date: 15.12.2017
  Time: 09:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Willkommensseite</title>
</head>
<body>
<p>Hallo ${name}! Herzlich Willkomen</p>
<p>Deine Todos sind:
<ol>
    <c:forEach var="todo" items="todos">
        <li>
                ${todos.name}
        </li>
    </c:forEach>
</ol>
</p>
</body>
</html>
