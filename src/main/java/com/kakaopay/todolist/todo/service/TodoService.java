package com.kakaopay.todolist.todo.service;

import com.kakaopay.todolist.todo.repo.TodoRepo;
import com.kakaopay.todolist.todo.vo.TodoList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TodoService {

    @Autowired
    TodoRepo todoRepo;

    public TodoList getTodo(TodoList todoList) throws Exception {

        Optional<TodoList> todo = todoRepo.findById(todoList.getId());
        if(todo.isPresent()){
            return todo.get();
        }else{
            throw new Exception();
        }
    }
}
