package com.example.demo.controllers;

import com.example.demo.model.dao.TaskDao;
import com.example.demo.model.entity.Task;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import static java.util.Objects.nonNull;

@AllArgsConstructor
@RestController
@Slf4j
public class TaskController {

    private final TaskDao taskDao;

    @PostMapping("/task/create")
    public String createTask(@RequestBody Task task) {
        if (nonNull(task.getDate())) {
            taskDao.saveTask(task);
            return "task created successful";
        } else {
            return "task object can't be null";
        }
    }
    @GetMapping("/task/{id}")
    public Task getTask(@PathVariable Long id){
        return taskDao.getTask(id);
    }

    @PatchMapping("/task/{id}:mark-as-done")
    public Task patchTask(@PathVariable Long id){
        return taskDao.markAsDone(id);
    }
}
