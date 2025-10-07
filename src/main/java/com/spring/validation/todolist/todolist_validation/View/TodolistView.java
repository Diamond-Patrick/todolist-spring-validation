package com.spring.validation.todolist.todolist_validation.View;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.validation.todolist.todolist_validation.Service.TodolistServiceImpl;
import com.spring.validation.todolist.todolist_validation.Utilities.UtilityScanner;

import jakarta.validation.ConstraintViolationException;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Component
@AllArgsConstructor
@Slf4j
public class TodolistView {

    @Autowired
    TodolistServiceImpl todoService;

    public void mainPage() {

        while (true) {
            System.out.println("\n T O D O L I S T");
            todoService.showData();
            System.out.println("-----------------------------------------");
            System.out.println("1. Add Your Todo");
            System.out.println("2. Delete Your Todo");
            System.out.println("3. Update Your Todo");
            System.out.println("x. Exit");

            String input = UtilityScanner.input("choose");

            if (input.equals("1")) {
                add();

            } else if (input.equals("2")) {
                delete();

            } else if (input.equals("3")) {
                update();

            } else if (input.toLowerCase().equals("x")) {
                break;

            } else {
                System.out.println("Please choose properly");
            }
        }
    }

    public void add() {

        System.out.println("\n A D D  T O D O L I S T");

        String input = UtilityScanner.input("Add new todo (x: back to main page)");

        if (input.toLowerCase().equals("x")) {
            mainPage();

        } else {

            try {
                todoService.add(input);
                System.out.println("success to add new todo!");

            } catch (ConstraintViolationException e) {
                log.error(e.getMessage(), e);
                System.out.println("Fail to add new todo...");
            }
        }
    }

    public void delete() {

        System.out.println("\n D E L E T E  T O D O L I S T");
        String input = UtilityScanner.input("Input the index (x: back to main page)");

        if (input.toLowerCase().equals("x")) {
            mainPage();

        } else {
            try {
                todoService.delete(Integer.parseInt(input));
                System.out.println("Success delete todo!");

            } catch (ConstraintViolationException e) {
                log.error(e.getMessage(), e);
                System.out.println("Fail to delete todo");

            } catch (IndexOutOfBoundsException e) {
                log.error(e.getMessage(), e);
                System.out.println("your index is not found");

            } catch (NumberFormatException e) {
                log.error(e.getMessage(), e);
                System.out.println("you must fill the number only");
            }
        }
    }

    public void update() {
        System.out.println("\n U P D A T E  T O D O L I S T");
        String index = UtilityScanner.input("Input the index");
        String todo = UtilityScanner.input("Input the index");

        try {
            todoService.update(Integer.parseInt(index), todo);
            System.out.println("Success to update todo!");
        } catch (ConstraintViolationException e) {
            log.error(e.getMessage(), e);
            System.out.println("Fail to delete todo");

        } catch (IndexOutOfBoundsException e) {
            log.error(e.getMessage(), e);
            System.out.println("your index is not found");

        } catch (NumberFormatException e) {
            log.error(e.getMessage(), e);
            System.out.println("you must fill the number only");
        }
    }
}
