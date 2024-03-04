package org.duckstudios.todoappfinal.dao;

import org.duckstudios.todoappfinal.dto.TaskDTO;
import org.duckstudios.todoappfinal.models.Task;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

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

    public void createTask(TaskDTO taskDTO){
        Task task = new Task(taskDTO.name, taskDTO.description);
        this.taskRepository.save(task);
    }

    public void updateTaskByID(Long id, TaskDTO taskDTO) {
        Optional<Task> optionalTask = this.taskRepository.findById(id);
        if (optionalTask.isPresent()){
            Task updatedTask = optionalTask.get();
            updatedTask.setName(taskDTO.name);
            updatedTask.setDescription(taskDTO.description);
            this.taskRepository.save(updatedTask);
    }else{
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Task met dat id bestaat niet"
            );
        }
    }

    public void checkTask(Long id) {
        Optional<Task> optionalTask = this.taskRepository.findById(id);
        if (optionalTask.isPresent()) {
            Task task = optionalTask.get();
            task.setFinished(true);
            this.taskRepository.save(task);
        }else{
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Task met dat id bestaat niet"
            );
        }
    }
}
