package com.spring.validation.todolist.todolist_validation.Service;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public interface TodolistService {

    boolean add(@NotBlank String data);

    void delete(@Positive int num);

    void update(@Positive int index, @NotBlank String data);

    void showData();
}
