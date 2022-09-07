package com.pixel.taskmanager.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

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


    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
    @JoinTable(
            name = "employee_project",
            joinColumns = @JoinColumn(name = "employee_id"),
            inverseJoinColumns = @JoinColumn(name = "project_id")
    )
    private Set<Project> project;


    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
    @JoinTable(
            name = "employee_team",
            joinColumns = @JoinColumn(name = "employee_id"),
            inverseJoinColumns = @JoinColumn(name = "team_id")
    )
    private Set<Team> team;



}

