package com.spring.validation.todolist.todolist_validation.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class TodolistRepositoryImpl implements TodolistRepository {

    private ArrayList<String> entities = new ArrayList<>();

    @Override
    public void insert(String todo) {
        entities.add(todo);
    }

    @Override
    public void remove(int index) {
        entities.remove(index);
    }

    @Override
    public void update(int index, String todo) {
        entities.set(index, todo);
    }

    @Override
    public List<String> showAll() {
        return entities;
    }
}