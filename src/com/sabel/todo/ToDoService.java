package com.sabel.todo;

import java.util.ArrayList;
import java.util.Iterator;
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

    public void add(ToDo toDo) {
        toDos.add(toDo);
    }

    public void delete(ToDo todo){
        toDos.remove(todo);
    }

    public void loesche(String name){
        Iterator<ToDo> iterator = toDos.iterator();
        while (iterator.hasNext()){
            ToDo toDo = iterator.next();
            if(toDo.getName().equals(name)){
                iterator.remove();
            }
        }
    }
}
