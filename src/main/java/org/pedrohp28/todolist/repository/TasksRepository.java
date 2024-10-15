package org.pedrohp28.todolist.repository;

import org.pedrohp28.todolist.model.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TasksRepository extends JpaRepository<Tasks, Long> {
}
