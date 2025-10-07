package com.spring.validation.todolist.todolist_validation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.spring.validation.todolist.todolist_validation.Repository.TodolistRepositoryImpl;

@SpringBootTest(classes = TodolistRepositoryImpl.class)
public class TodolistRepositoryTest {

    @Autowired
    TodolistRepositoryImpl todoRepoImpl;

    @BeforeEach
    void testInsert() {

        todoRepoImpl.insert("test1");
        todoRepoImpl.insert("test2");
        todoRepoImpl.insert("test3");
    }

    @Test
    void testShowAll() {
        todoRepoImpl.showAll().forEach(t -> System.out.println(t));
    }

    @Test
    void testRemove() {
        todoRepoImpl.remove(1);

        todoRepoImpl.showAll().forEach(t -> System.out.println(t.indexOf(t) + ". " + t));
    }

    @Test
    void testUpdate() {
        todoRepoImpl.update(1, "coba");

        todoRepoImpl.showAll().forEach(t -> System.out.println(t));
    }
}
