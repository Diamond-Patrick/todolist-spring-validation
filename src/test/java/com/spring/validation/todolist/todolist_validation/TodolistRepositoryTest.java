package com.spring.validation.todolist.todolist_validation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.spring.validation.todolist.todolist_validation.Repository.TodolistRepositoryImpl;

@SpringBootTest(classes = TodolistRepositoryImpl.class)
public class TodolistRepositoryTest {

    @Autowired
    TodolistRepositoryImpl todoRepoImpl;

}
