package com.example.demo.model.repository;


import com.example.demo.model.entity.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends PagingAndSortingRepository<Task, Long>, CrudRepository<Task, Long> {
}
