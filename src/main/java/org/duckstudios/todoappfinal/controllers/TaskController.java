package org.duckstudios.todoappfinal.controllers;


import org.duckstudios.todoappfinal.dao.TaskDAO;
import org.duckstudios.todoappfinal.dto.TaskDTO;
import org.duckstudios.todoappfinal.models.Task;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private TaskDAO taskDAO;

    public TaskController(TaskDAO taskDAO) {
        this.taskDAO = taskDAO;
    }

    @GetMapping
    public ResponseEntity<List<Task>> getAllTask(){
        List<Task> tasks = this.taskDAO.getAllTasks();
            return ResponseEntity.ok(tasks);
    }

    @PostMapping
    public ResponseEntity<String> createTask(@RequestBody TaskDTO taskDTO){
        this.taskDAO.createTask(taskDTO);
        return ResponseEntity.ok("Het is gelukt!");
    }

}
