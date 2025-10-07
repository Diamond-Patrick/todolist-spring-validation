package com.spring.validation.todolist.todolist_validation.Service;

import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import com.spring.validation.todolist.todolist_validation.Repository.TodolistRepositoryImpl;

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

        todoRepo.insert(data);
        return true;
    }

    @Override
    public boolean delete(@Positive int num) {
        todoRepo.remove(num - 1);
        return true;
    }

    @Override
    public boolean update(@Positive int index, @NotBlank String data) {
        todoRepo.update(index - 1, data);
        return true;
    }

    @Override
    public void showData() {

        todoRepo.showAll().forEach(t -> System.out.println((todoRepo.showAll().indexOf(t) + 1) + ". " + t));
    }

}
