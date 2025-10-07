package com.spring.validation.todolist.todolist_validation.Repository;

import java.util.List;

public interface TodolistRepository {

    void insert(String todo);

    void remove(int index);

    void update(int index, String todo);

    List<String> showAll();
}
