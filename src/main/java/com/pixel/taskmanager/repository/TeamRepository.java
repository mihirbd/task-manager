package com.pixel.taskmanager.repository;

import com.pixel.taskmanager.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository <Team, Long> {
}
