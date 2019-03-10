package com.kakaopay.todolist.todo.controller;

import org.springframework.web.bind.annotation.*;


  /**
    * 할일 CRUD 컨트롤러
    * @author 강성효
    **/
@RestController
public class TodoController {

    @GetMapping("/todo/{id}")
    public void getTodo(){

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
