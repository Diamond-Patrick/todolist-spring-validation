package com.spring.validation.todolist.todolist_validation.Repository;

import java.util.ArrayList;
import java.util.List;

import com.spring.validation.todolist.todolist_validation.Entity.TodolistEntity;

public class TodolistRepositoryImpl implements TodolistRepository {

    List<TodolistEntity> entities = new ArrayList<>();

    @Override
    public void insert(String todo) {
        entities.add(new TodolistEntity(todo));
    }

    @Override
    public void remove(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public void update(int index, String newTodo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void showAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'showAll'");
    }

}
