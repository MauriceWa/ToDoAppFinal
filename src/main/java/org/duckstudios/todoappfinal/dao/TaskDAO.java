package org.duckstudios.todoappfinal.dao;

import org.duckstudios.todoappfinal.models.Task;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TaskDAO {

    private TaskRepository taskRepository;

    public TaskDAO(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getAllTasks(){
        List<Task> tasks = this.taskRepository.findAll();
        return tasks;
    }
}
