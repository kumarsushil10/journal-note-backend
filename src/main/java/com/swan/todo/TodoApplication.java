package com.swan.todo;

import com.swan.todo.models.TodoModel;
import com.swan.todo.repositories.TodoRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;
import java.util.Date;

@SpringBootApplication
public class TodoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(TodoApplication.class, args);
		System.out.println("Hello Dev !");
		System.out.println("App Started...");
	}

}
