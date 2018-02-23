package com.sabel.todo;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.io.Serializable;
import java.util.List;

@ApplicationScoped
public class ToDoService implements Serializable {

    @Inject
    private ToDoStore toDoStore;

    public List<ToDo> retrieveToDos() {
        return toDoStore.getToDos();
    }

    public void add(ToDo toDo) {
        toDoStore.store(toDo);
    }

    public void delete(ToDo todo) {
        toDoStore.delete(todo);
    }



}
