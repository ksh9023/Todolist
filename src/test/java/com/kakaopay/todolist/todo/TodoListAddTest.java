package com.kakaopay.todolist.todo;

import com.kakaopay.todolist.todo.repo.TodoRepo;
import com.kakaopay.todolist.todo.vo.TodoList;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TodoListAddTest {

    @Autowired
    TodoRepo todoRepo;

    @Test
    public void TodoAddandSearchTest(){
        TodoList todoList = new TodoList();
        todoList.setContent("clean my room");
        todoRepo.save(todoList);

        Optional<TodoList> search = todoRepo.findById(1);
        assertThat(search.get().getContent()).isEqualTo("clean my room");

        todoList.setContent("정수기 청소");
        todoRepo.save(todoList);
        search = todoRepo.findById(2);
    }

}
