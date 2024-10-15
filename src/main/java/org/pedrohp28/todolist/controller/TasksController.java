package org.pedrohp28.todolist.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.pedrohp28.todolist.dto.GetTasksDto;
import org.pedrohp28.todolist.dto.PostTasksDto;
import org.pedrohp28.todolist.service.TasksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/task")
@Tag(name = "To Do List")
public class TasksController {

    @Autowired
    TasksService service;

    @GetMapping
    @Operation(summary = "Busca todas as tarefas", description = "Endpoint que busca todas as tarefas já cadastradas no banco de dados")
    public ResponseEntity<List<GetTasksDto>> gatAllTasks() {
        return ResponseEntity.ok(service.getAllTasks());
    }

    @PostMapping
    @Operation(summary = "Cadastra uma tarefa", description = "Cadastra uma nova tarefa informando o nome e a descrição da terefa")
    public void newTask(@Valid @RequestBody PostTasksDto dto) {
        service.newTask(dto);
    }

    @PutMapping("{id}")
    @Operation(summary = "Atualiza o status da tarefa", description = "Atualiza o status da tarefa para 'To do' ou 'Done' informando o id da tarefa")
    public void updateTaskStatus(@PathVariable Long id) {
        service.updateTaskStatus(id);
    }

    @DeleteMapping("{id}")
    @Operation(summary = "Deleta uma tarefa", description = "Deleta uma tarefa do banco de dados informando o id da tarefa")
    public void deleteTask(@PathVariable Long id) {
        service.deleteTask(id);
    }
}
