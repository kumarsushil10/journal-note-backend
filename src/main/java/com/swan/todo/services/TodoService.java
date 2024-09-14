package com.swan.todo.services;

import com.swan.todo.models.TodoModel;
import com.swan.todo.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    private TodoRepository repository;

    @Autowired
    public void setRepository(TodoRepository repository) {
        this.repository = repository;
    }

    public void addTodo(TodoModel todoModel) {
        repository.save(todoModel);
    }

    public List<TodoModel> getAllTodo() {
        return repository.findAll();
    }

    public TodoModel getTodo(int id) {
        return repository.findById(id).orElse(new TodoModel());
    }

    public void updateTodo(TodoModel todoModel) {
        repository.save(todoModel);
    }

    public void deleteTodo(int id) {
        repository.deleteById(id);
    }

    public List<TodoModel> getAllTodoOrderByUnCompleted() {
       return repository.findAllSortedByBooleanAsc();
    }

    public List<TodoModel> getAllTodoOrderByCompleted() {
        return repository.findAllSortedByBooleanDesc();
    }
}
