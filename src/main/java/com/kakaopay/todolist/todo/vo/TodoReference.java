package com.kakaopay.todolist.todo.vo;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
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
    @GeneratedValue
    public int id;

}
