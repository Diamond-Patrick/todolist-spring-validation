package com.spring.validation.todolist.todolist_validation.Repository;

import com.spring.validation.todolist.todolist_validation.Entity.TodolistEntity;

public interface TodolistRepository {

    void insert(TodolistEntity todo);

    void remove(TodolistEntity todo);

    void update(TodolistEntity todo);

    void showAll();
}
