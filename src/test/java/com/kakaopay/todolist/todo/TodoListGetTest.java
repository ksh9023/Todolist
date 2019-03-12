package com.kakaopay.todolist.todo;

import com.kakaopay.todolist.todo.service.TodoService;
import com.kakaopay.todolist.todo.vo.TodoList;
import lombok.extern.java.Log;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.logging.Logger;

@Log
@RunWith(SpringRunner.class)
@SpringBootTest
public class TodoListGetTest {
    @Autowired
    TodoService todoService;

    @Test
    public void TodoListGetTest() throws Exception {
       List<TodoList> todoList = todoService.getTodoList();
        todoList.stream()
                .forEach(todo -> log.info(todo.toString()));
    }
}
