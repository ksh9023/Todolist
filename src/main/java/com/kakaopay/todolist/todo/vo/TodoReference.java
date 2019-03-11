package com.kakaopay.todolist.todo.vo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

/**
 * 할일 참조를 위한 테이블
 * @author 강성효
 **/
@Getter
@Setter
@Entity
@Table(name = "todolist_reference")
public class TodoReference {
    @Id
    public int id;

    @ManyToOne
    @JoinColumn(name = "todolist_id",referencedColumnName = "id")
    public TodoList todoLists;
}
