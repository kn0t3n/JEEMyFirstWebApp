package com.sabel.todo;

import java.util.ArrayList;
import java.util.List;

public class ToDoService {

    private static List<ToDo> toDos = new ArrayList<>();

    static {
        toDos.add(new ToDo("Java EE lernen"));
        toDos.add(new ToDo("BA lernen"));
        toDos.add(new ToDo("Tanzen lernen"));
    }

    public ToDoService() {

    }

    public List<ToDo> retrieveToDos() {
        return toDos;
    }
}
