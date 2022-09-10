package com.pixel.taskmanager.repository;

import com.pixel.taskmanager.entity.TimeSheet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimeSheetRepository extends JpaRepository<TimeSheet, Long> {

}
