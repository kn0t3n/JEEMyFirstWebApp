package com.sabel.todo;

import com.sabel.todo.ToDo;
import com.sabel.todo.ToDoService;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet (urlPatterns = "/addTodo.do")

public class addTodoServlet extends HttpServlet {

        @Inject
        private ToDoService toDoService;


        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            req.getRequestDispatcher("/WEB-INF/Views/addTodo.jsp").forward(req, resp);
        }

        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            String todoName = req.getParameter("todo");
            ToDo toDo = new ToDo(todoName);
            toDoService.add(toDo);
            resp.sendRedirect("/todo.do");
        }
    }

