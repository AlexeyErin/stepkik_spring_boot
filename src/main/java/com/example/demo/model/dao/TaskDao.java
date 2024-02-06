package com.example.demo.model.dao;

import com.example.demo.model.entity.Task;
import com.example.demo.model.repository.TaskRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@AllArgsConstructor
public class TaskDao {

    private final TaskRepository taskRepository;

    public Task saveTask(Task task){
        log.debug("Saving new task entity");
        return taskRepository.save(task);
    }
}
