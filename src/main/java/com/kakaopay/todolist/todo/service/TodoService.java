package com.kakaopay.todolist.todo.service;

import com.kakaopay.todolist.todo.repo.TodoRepo;
import com.kakaopay.todolist.todo.vo.TodoList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TodoService {

    @Autowired
    TodoRepo todoRepo;

    public ResponseEntity<TodoList> getTodo(TodoList todoList) throws Exception {

        Optional<TodoList> todo = todoRepo.findById(todoList.getId());
        ResponseEntity<TodoList> responseEntity;

        if(todo.isPresent()){
            responseEntity = new ResponseEntity(todo, HttpStatus.OK);
        }else{
            responseEntity = new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
        return responseEntity;
    }
    public List<TodoList> getTodoList() throws Exception {

        Iterable<TodoList> todoList_Iter = todoRepo.findAll();
        ResponseEntity<TodoList> responseEntity;
        List<TodoList> todoList = new ArrayList<>();
        try{
            todoList_Iter.forEach(todo->todoList.add(todo));
        }catch (Exception e){
             throw new Exception();
        }
        return todoList;

    }
    public ResponseEntity deleteTodo(TodoList todoList){
        ResponseEntity responseEntity;
        try {
            todoRepo.deleteById(todoList.getId());
            responseEntity = new ResponseEntity(HttpStatus.OK);
        }catch (Exception e){
            responseEntity = new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
        return responseEntity;
    }

    public ResponseEntity updateORregisterTodo(TodoList todoList){

        TodoList res= todoRepo.save(todoList);
        ResponseEntity responseEntity;

        if(res != null){
            responseEntity = new ResponseEntity(HttpStatus.OK);
        }else{
            responseEntity = new ResponseEntity(HttpStatus.BAD_REQUEST);
        }

        return responseEntity;
    }

}
