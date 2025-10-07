package com.spring.validation.todolist.todolist_validation.Service;

import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import com.spring.validation.todolist.todolist_validation.Entity.TodolistEntity;
import com.spring.validation.todolist.todolist_validation.Repository.TodolistRepositoryImpl;

import jakarta.validation.ConstraintViolationException;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Component
@AllArgsConstructor
@Validated
@Slf4j
public class TodolistServiceImpl implements TodolistService {

    private TodolistRepositoryImpl todoRepo;

    @Override
    public boolean add(@NotBlank String data) {

        try {
            TodolistEntity todo = new TodolistEntity();
            todo.setData(data.trim());
            todoRepo.insert(todo);

            return true;

        } catch (ConstraintViolationException e) {
            log.error(e.getMessage(), e);
            return false;
        }
    }

    @Override
    public void delete(@Positive int num) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public void update(@Positive int index, @NotBlank String data) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void showData() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'showData'");
    }

}
