package com.kakaopay.todolist.todo.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

/**
 * 할일 참조를 위한 테이블
 * @author 강성효
 **/
@Getter
@Setter
@Entity
@ToString
@Table(name = "todolist_reference")
public class TodoReference {
    @Id
    public int id;

    @ManyToOne
    @JoinColumn(name = "todolist_id",referencedColumnName = "id")
    public TodoList todoLists;
}
