package com.pixel.taskmanager.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "role")
public class Role extends BaseEntity{


    @Column(name = "name", nullable = false, unique = true)
    private String name;

}
