package com.pixel.taskmanager.repository;

import com.pixel.taskmanager.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends JpaRepository <Team, Long> {
}
