package com.spring.validation.todolist.todolist_validation.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.spring.validation.todolist.todolist_validation.Entity.TodolistEntity;

@Component
public class TodolistRepositoryImpl implements TodolistRepository {

    private List<TodolistEntity> entities = new ArrayList<>();

    @Override
    public void insert(TodolistEntity todo) {
        entities.add(todo);
    }

    @Override
    public void remove(TodolistEntity todo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public void update(TodolistEntity todo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public List<TodolistEntity> showAll() {
        return entities;
    }
}
