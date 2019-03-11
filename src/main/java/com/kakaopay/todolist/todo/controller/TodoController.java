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
public class TodoController {

    @Autowired
    TodoService todoService;

    @GetMapping("/todo/{id}")
    public ResponseEntity<TodoList> getTodo(@ModelAttribute TodoList todoList) throws Exception {
        log.info("입력 : "+todoList.getId());
         ResponseEntity<TodoList> responseEntity = new ResponseEntity<>(todoService.getTodo(todoList), HttpStatus.OK);
         return responseEntity;
    }
    @PostMapping("/todo")
    public void regTodo(){

    }
    @PutMapping("/todo/{id}")
    public void modTodo(){

    }
    @DeleteMapping("/todo/{id}")
    public void delTodo(){

    }

}
