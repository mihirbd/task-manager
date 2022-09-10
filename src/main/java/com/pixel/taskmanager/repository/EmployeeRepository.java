package com.pixel.taskmanager.repository;

import com.pixel.taskmanager.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
}
