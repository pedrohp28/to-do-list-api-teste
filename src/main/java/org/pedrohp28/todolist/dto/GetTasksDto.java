package org.pedrohp28.todolist.dto;

import org.pedrohp28.todolist.model.Tasks;

public record GetTasksDto(Long id, String name, String description, String status) {
    public GetTasksDto(Tasks tasks){
        this(tasks.getId(), tasks.getName(), tasks.getDescription(), tasks.getStatus());
    }
}
