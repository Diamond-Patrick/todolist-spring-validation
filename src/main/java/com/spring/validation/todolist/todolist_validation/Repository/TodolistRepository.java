package com.spring.validation.todolist.todolist_validation.Repository;

public interface TodolistRepository {

    void insert(String todo);

    void remove(int index);

    void update(int index, String newTodo);

    void showAll();
}
