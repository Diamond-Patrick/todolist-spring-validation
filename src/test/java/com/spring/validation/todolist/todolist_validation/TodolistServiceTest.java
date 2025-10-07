package com.spring.validation.todolist.todolist_validation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.spring.validation.todolist.todolist_validation.Service.TodolistServiceImpl;

import jakarta.validation.ConstraintViolationException;

@SpringBootTest
public class TodolistServiceTest {

    @Autowired
    TodolistServiceImpl todoService;

    @BeforeEach
    void testAdd() {
        todoService.add("test1");
        todoService.add("test2");
        todoService.add("test3");
    }

    @Test
    void testAddSuccess() {
        boolean b = todoService.add("Hello World");

        Assertions.assertTrue(b);
    }

    @Test
    void testAddFail() {
        Assertions.assertThrows(ConstraintViolationException.class, () -> todoService.add("    "));
    }

    @Test
    void testShowDatas() {
        todoService.showData();
    }

    @Test
    void testDeleteSuccess() {
        Assertions.assertTrue(todoService.delete(3));
        todoService.showData();
    }
}
