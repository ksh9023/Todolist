package com.kakaopay.todolist.view;

import com.kakaopay.todolist.todo.repo.TodoRepo;
import com.kakaopay.todolist.todo.service.TodoService;
import com.kakaopay.todolist.todo.vo.TodoList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ViewController {

    @Autowired
    TodoService todoService;

    @RequestMapping("/")
    public String index(Model model) throws Exception {

        List<TodoList> todoList = todoService.getTodoList();
        model.addAttribute("todoList",todoList);
        return "index";
    }
}
