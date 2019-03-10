package com.kakaopay.todolist.todo.vo;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.Id;
import javax.persistence.*;
import java.sql.Timestamp;
/**
 * Todo 테이블
 * @author 강성효
 **/
@Getter
@Setter
@Embeddable
@Table(name = "todolist")
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    private String content;

    @CreationTimestamp
    private Timestamp regdate;

    @UpdateTimestamp
    private Timestamp moddate;

}
