package com.sabel.todo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/deleteTodo.do")
public class deleteTodoServlet extends HttpServlet{

    private ToDoService toDoService = new ToDoService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String todoname =req.getParameter("name");
        toDoService.loesche(todoname);
        resp.sendRedirect("/todo.do");
        System.out.println("deleteTodo.do");
    }
}
