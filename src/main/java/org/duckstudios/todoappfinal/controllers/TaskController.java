package org.duckstudios.todoappfinal.controllers;


import org.duckstudios.todoappfinal.dao.TaskDAO;
import org.duckstudios.todoappfinal.models.Task;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private TaskDAO taskDAO;

    public TaskController(TaskDAO taskDAO) {
        this.taskDAO = taskDAO;
    }

    @GetMapping
    public List<Task> getAllTask(){
            return this.taskDAO.getAllTasks();
    }


}
