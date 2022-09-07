package com.pixel.taskmanager.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Data
@Entity
@Table(name="employee", uniqueConstraints={@UniqueConstraint(columnNames = {"email"})})
public class Employee extends BaseEntity {

    @Column(name = "emp_id", nullable = false)
    private String emp_id;

    @Column(name = "emp_name", nullable = false)
    private String emp_name;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "phone", nullable = false, unique = true)
    private String phone;

    @Column(name = "designation", nullable = false)
    private String designation;

    @Column(name = "department", nullable = false)
    private String department;

    @Column(name = "organization", nullable = false)
    private String organization;
}

