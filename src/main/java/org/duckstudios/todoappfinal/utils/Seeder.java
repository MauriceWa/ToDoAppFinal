package org.duckstudios.todoappfinal.utils;

import org.duckstudios.todoappfinal.dao.TaskRepository;
import org.duckstudios.todoappfinal.models.Task;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

//alleen om te testen

@Component
public class Seeder {
    private TaskRepository taskRepository;

    public Seeder(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @EventListener
    public void seed(ContextRefreshedEvent event){
        Task task1 = new Task("Videos maken", "IN springboot");
        Task task2 = new Task("Videos uploaden", "IN springboot");

        this.taskRepository.save(task1);
        this.taskRepository.save(task2);
    }
}
