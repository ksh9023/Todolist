package com.kakaopay.todolist.todo;

import com.kakaopay.todolist.todo.vo.Todo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TodoListCrudTests {

    @Test
    public void insertTodoElement(){
        Todo todo = new Todo();
        todo.getContent();
    }

}
