<%--
  Created by IntelliJ IDEA.
  User: Marcel
  Date: 15.12.2017
  Time: 09:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../common/header.jspf" %>
<%@include file="../common/navigation.jspf" %>
<div class="container">
    <p>Hallo ${name}! Herzlich Willkommen</p>
    <p>Deine Todos sind: </p>
    <ol>
        <c:forEach var="todo" items="${todos}">
            <li>
                    ${todo.name} &nbsp; &nbsp; &nbsp; <a href="/deleteTodo.do?name=${todo.name}">Löschen</a>
            </li>
        </c:forEach>

    </ol>

    <form method="get" action="/addTodo.do">
        <input type="submit" value="Neues Todo hinzufügen">
    </form>
</div>

<%@include file="../common/footer.jspf" %>
