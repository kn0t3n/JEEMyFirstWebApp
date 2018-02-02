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
    <link href="webjars/bootstrap/3.3.7-1/css/bootstrap.min.css">

    <title>Willkommensseite</title>
</head>
<body>
<p>Hallo ${name}! Herzlich Willkomen</p>
<p>Deine Todos sind:
    <%--<ol>--%>
    <%--<c:forEach begin="1" end="10" var="i">--%>
    <%--<li>--%>
    <%--${i}--%>
    <%--</li>--%>
    <%--</c:forEach>--%>
    <%--</ol>--%>
<ol>

    <c:forEach var="todo" items="${todos}">
        <li>
                ${todo.name} &nbsp; &nbsp; &nbsp; <a href="/deleteTodo.do?name=${todo.name}">Löschen</a>
        </li>
    </c:forEach>
</ol>
</p>
<form method="get" action="/addTodo.do">
    <input type="submit" name="addTodo" value="Neues Todo hinzufügen">
</form>

<script src="webjars/jquery/3.3.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.7-1/js/bootstrap.min.js"></script>

</body>
</html>
