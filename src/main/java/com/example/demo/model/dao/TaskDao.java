package com.example.demo.model.dao;

import com.example.demo.model.entity.Task;
import com.example.demo.model.repository.TaskRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import static java.util.Objects.isNull;

@Service
@Slf4j
@AllArgsConstructor
public class TaskDao {

    private final TaskRepository taskRepository;

    public Task saveTask(Task task){
        log.debug("Saving new task entity");
        return taskRepository.save(task);
    }

    public Task getTask(Long taskId){
        log.debug("searching task with id = {}", taskId);
        return taskRepository.findById(taskId).orElse(null);
    }

    public Task markAsDone(Long taskId){
        Task task = taskRepository.findById(taskId).orElse(null);
        if(isNull(task)){
            return null;
        }
        task.setDone(true);
        taskRepository.save(task);
        return task;
    }
}
