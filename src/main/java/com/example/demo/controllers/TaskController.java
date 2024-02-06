package com.example.demo.controllers;

import com.example.demo.model.dao.TaskDao;
import com.example.demo.model.entity.Task;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static java.util.Objects.nonNull;

@AllArgsConstructor
@RestController
@Slf4j
public class TaskController {

    private final TaskDao taskDao;

    @PostMapping("/saveTask")
    public String createTask(@RequestBody Task task) {
        if (nonNull(task.getDate())) {
            taskDao.saveTask(task);
            return "task created successful";
        } else {
            return "task object can't be null";
        }
    }
}
