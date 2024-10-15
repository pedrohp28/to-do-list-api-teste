package org.pedrohp28.todolist.model;

import jakarta.persistence.*;
import org.pedrohp28.todolist.dto.PostTasksDto;

@Entity
public class Tasks {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false, length = 200)
    private String description;

    private String status;

    public Tasks() {
    }

    public Tasks(PostTasksDto dto) {
        this.name = dto.name();
        this.description = dto.description();
        this.status = "To do";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
