package kz.bitlab.springmiddletodolist.repository;

import kz.bitlab.springmiddletodolist.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}