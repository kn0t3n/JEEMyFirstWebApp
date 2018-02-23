package com.sabel.todo;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/deleteTodo.do")
public class deleteTodoServlet extends HttpServlet{

    @Inject
    private ToDoService toDoService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String todoname =req.getParameter("name");
        toDoService.delete(new ToDo(todoname));
        resp.sendRedirect("/todo.do");
    }
}
