package com.kakaopay.todolist.todo.repo;

import com.kakaopay.todolist.todo.vo.TodoList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface TodoRepo extends CrudRepository<TodoList,Integer> {

}
