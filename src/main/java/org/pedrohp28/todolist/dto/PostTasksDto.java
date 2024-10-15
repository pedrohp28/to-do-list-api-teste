package org.pedrohp28.todolist.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record PostTasksDto(
        @NotNull
        String name,
        @NotBlank
        String description) {
}
