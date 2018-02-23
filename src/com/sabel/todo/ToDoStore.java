package com.sabel.todo;

import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@SessionScoped
public class ToDoStore implements Serializable {

    private List<ToDo> toDos;

    public ToDoStore() {
        this.toDos = new ArrayList<>();
        this.toDos.add(new ToDo("Java EE lernen"));
        this.toDos.add(new ToDo("BA lernen"));
        this.toDos.add(new ToDo("Tanzen lernen"));
    }

    public void store(ToDo toDo) {
        toDos.add(toDo);
    }

    public void delete(ToDo todo) {
        toDos.remove(todo);
    }

    public List<ToDo> getToDos() {
        return toDos;
    }

}
