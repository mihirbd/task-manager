package com.pixel.taskmanager.repository;

import com.pixel.taskmanager.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository <Task, Long> {
}
