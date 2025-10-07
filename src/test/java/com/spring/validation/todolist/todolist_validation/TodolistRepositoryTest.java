package com.spring.validation.todolist.todolist_validation;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.spring.validation.todolist.todolist_validation.Entity.TodolistEntity;
import com.spring.validation.todolist.todolist_validation.Repository.TodolistRepositoryImpl;

@SpringBootTest(classes = TodolistRepositoryImpl.class)
public class TodolistRepositoryTest {

    @Autowired
    TodolistRepositoryImpl todoRepoImpl;

    @Test
    void testInsert() {
        TodolistEntity todo1 = new TodolistEntity();
        todo1.setData("test1");
        todoRepoImpl.insert(todo1);

        TodolistEntity todo2 = new TodolistEntity();
        todo2.setData("test2");
        todoRepoImpl.insert(todo2);

        TodolistEntity todo3 = new TodolistEntity();
        todo3.setData("test3");
        todoRepoImpl.insert(todo3);

        todoRepoImpl.showAll().forEach(t -> System.out.println(t.getData()));
    }

}
