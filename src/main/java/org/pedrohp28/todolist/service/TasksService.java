package org.pedrohp28.todolist.service;

import org.pedrohp28.todolist.dto.GetTasksDto;
import org.pedrohp28.todolist.dto.PostTasksDto;
import org.pedrohp28.todolist.model.Tasks;
import org.pedrohp28.todolist.repository.TasksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
public class TasksService {

    @Autowired
    private TasksRepository repository;
    private Logger logger = Logger.getLogger(TasksService.class.getName());

    public List<GetTasksDto> getAllTasks() {
        logger.info("Get all tasks");
        return repository
                .findAll()
                .stream()
                .map(GetTasksDto::new)
                .toList();
    }

    public void newTask(PostTasksDto dto) {
        logger.info("Create a new task");
        repository.save(new Tasks(dto));
    }

    public void updateTaskStatus(Long id) {
        Tasks task = repository.findById(id).orElseThrow(() -> new RuntimeException("Task not found"));
        logger.info("Update task status from " + task.getName());
        if (task.getStatus().equals("To do")) {
            task.setStatus("Done");
            repository.save(task);
        } else {
            task.setStatus("To do");
            repository.save(task);
        }

    }

    public void deleteTask(Long id) {
        Tasks task = repository.findById(id).orElseThrow(() -> new RuntimeException("Task not found"));
        logger.info("Delete task " + task.getName());
        repository.delete(task);
    }
}
