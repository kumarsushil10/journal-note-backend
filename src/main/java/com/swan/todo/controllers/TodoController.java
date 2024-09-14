package com.swan.todo.controllers;

import com.swan.todo.models.TodoModel;
import com.swan.todo.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoController {

    private TodoService service;

    @Autowired
    public void setService(TodoService service) {
        this.service = service;
    }

    @PostMapping("/todo")
    public void addTodo(@RequestBody TodoModel todoModel) {
        service.addTodo(todoModel);
    }

    @GetMapping("/todo/all")
    public List<TodoModel> getAllTodo() {
        return service.getAllTodo();
    }

    @GetMapping("/todo/{id}")
    public TodoModel getTodo(@PathVariable int id) {
        return service.getTodo(id);
    }

    @PutMapping("/todo")
    public void updateTodo(@RequestBody TodoModel todoModel) {
        service.updateTodo(todoModel);
    }

    @DeleteMapping("/todo/{id}")
    public void deleteTodo(@PathVariable int id) {
        service.deleteTodo(id);
    }

    @GetMapping("/todo/uncompleted")
    public List<TodoModel> getAllTodoOrderByUnCompleted() {
        return service.getAllTodoOrderByUnCompleted();
    }

    @GetMapping("/todo/completed")
    public List<TodoModel> getAllTodoOrderByCompleted() {
        return service.getAllTodoOrderByCompleted();
    }
}
