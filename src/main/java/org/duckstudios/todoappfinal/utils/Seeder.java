package org.duckstudios.todoappfinal.utils;

import org.duckstudios.todoappfinal.dao.CategoryRepository;
import org.duckstudios.todoappfinal.dao.TaskRepository;
import org.duckstudios.todoappfinal.models.Category;
import org.duckstudios.todoappfinal.models.Task;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

//alleen om te testen

@Component
public class Seeder {
    private TaskRepository taskRepository;
    private CategoryRepository categoryRepository;

    public Seeder(TaskRepository taskRepository, CategoryRepository categoryRepository) {
        this.taskRepository = taskRepository;
        this.categoryRepository = categoryRepository;
    }

    @EventListener
    public void seed(ContextRefreshedEvent event){
        Category category = new Category("Werk taken");
        this.categoryRepository.save(category);

        Task task1 = new Task("Videos maken", "IN springboot", category);
        Task task2 = new Task("Videos uploaden", "IN springboot", category);

        this.taskRepository.save(task1);
        this.taskRepository.save(task2);
    }
}
