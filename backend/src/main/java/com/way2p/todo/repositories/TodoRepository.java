package com.way2p.todo.repositories;

import com.way2p.todo.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TodoRepository extends JpaRepository<Todo, Integer> {

    @Query(value = "SELECT * FROM TODO", nativeQuery = true)
    List<Todo> findAll();
}
