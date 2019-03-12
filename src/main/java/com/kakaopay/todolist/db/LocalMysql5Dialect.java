package com.kakaopay.todolist.db;

import org.hibernate.dialect.MySQL5Dialect;

public class LocalMysql5Dialect extends MySQL5Dialect {
    @Override
    public String getTableTypeString() {
        return " ENGINE=InnoDB DEFAULT CHARSET=utf8";
    }
}
