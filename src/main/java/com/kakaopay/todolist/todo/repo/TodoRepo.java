package com.kakaopay.todolist.todo.repo;

import com.kakaopay.todolist.todo.vo.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepo extends CrudRepository<Todo,Long> {

}
