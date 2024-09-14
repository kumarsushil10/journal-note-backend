package com.swan.todo.repositories;

import com.swan.todo.models.TodoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends JpaRepository<TodoModel,Integer> {
    @Query("SELECT todo FROM TodoModel todo ORDER BY todo.isCompleted ASC")
    List<TodoModel> findAllSortedByBooleanAsc();

    @Query("SELECT todo FROM TodoModel todo ORDER BY todo.isCompleted Desc")
    List<TodoModel> findAllSortedByBooleanDesc();
}
