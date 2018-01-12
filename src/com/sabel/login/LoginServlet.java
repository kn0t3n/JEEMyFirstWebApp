package com.sabel.login;

import com.sabel.todo.ToDoService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/login.do")

public class LoginServlet extends HttpServlet {

    private LoginService loginService = new LoginService();
    private ToDoService toDoService = new ToDoService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("WEB-INF/Views/login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String password = req.getParameter("password");

        if (loginService.checkPassword(name, password)) {
            req.setAttribute("name", req.getParameter("name"));
            req.setAttribute("todos", toDoService.retrieveToDos());
            req.getRequestDispatcher("/WEB-INF/Views/welcome.jsp").forward(req, resp);

        } else {
            req.setAttribute("errorMessage", "Login nicht erfolgreich");
            req.getRequestDispatcher("/WEB-INF/Views/login.jsp").forward(req, resp);
        }

    }
}
