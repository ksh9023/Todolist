package com.kakaopay.todolist.todo.controller;

import com.kakaopay.todolist.todo.service.TodoService;
import com.kakaopay.todolist.todo.vo.TodoList;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;


/**
 * 할일 CRUD 컨트롤러
 * @author 강성효
 **/
@Log
@RestController
@RequestMapping("/api")
public class TodoController {

    @Autowired
    TodoService todoService;

    @GetMapping("/todo/{id}")
    public ResponseEntity<TodoList> getTodo(@ModelAttribute TodoList todoList) throws Exception {
        log.info("입력 : "+todoList.getId());
         ResponseEntity<TodoList> responseEntity = todoService.getTodo(todoList);
         return responseEntity;
    }
    @PostMapping("/todo")
    public ResponseEntity registerTodo(@ModelAttribute TodoList todoList){
        ResponseEntity<TodoList> responseEntity = todoService.updateORregisterTodo(todoList);
        return responseEntity;
    }

    @PutMapping("/todo/{id}")
    public ResponseEntity modifyTodo(@ModelAttribute TodoList todoList){
        ResponseEntity responseEntity = todoService.updateORregisterTodo(todoList);
        return responseEntity;
    }

    @DeleteMapping("/todo/{id}")
    public ResponseEntity delTodo(@ModelAttribute TodoList todoList){
        ResponseEntity responseEntity = todoService.deleteTodo(todoList);
        return responseEntity;
    }

}
