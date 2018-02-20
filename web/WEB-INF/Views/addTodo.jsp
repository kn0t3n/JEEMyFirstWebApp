<%--
  Created by IntelliJ IDEA.
  User: Philipp Schweiger
  Date: 19.01.2018
  Time: 09:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../common/header.jspf" %>
<%@include file="../common/navigation.jspf" %>
<div class="container">
    <form method="post" action="/addTodo.do">
        <input type="text" name="todo"/>
        <input type="submit" name="addTodo" value="Hinzufügen">
    </form>
</div>

<%@include file="../common/footer.jspf" %>
