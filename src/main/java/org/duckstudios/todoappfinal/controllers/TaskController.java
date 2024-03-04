package org.duckstudios.todoappfinal.controllers;


import org.duckstudios.todoappfinal.models.Task;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @GetMapping
    public Task getTask(){
        Task myTask = new Task("Videos maken",  "In springboot videos maken");
                return myTask;
    }


}
