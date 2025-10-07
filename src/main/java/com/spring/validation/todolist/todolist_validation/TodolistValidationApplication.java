package com.spring.validation.todolist.todolist_validation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.spring.validation.todolist.todolist_validation.View.TodolistView;

@SpringBootApplication
public class TodolistValidationApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication
				.run(TodolistValidationApplication.class, args);

		TodolistView view = run.getBean(TodolistView.class);
		view.mainPage();
	}

}
