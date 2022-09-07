package com.pixel.taskmanager.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="user", uniqueConstraints={@UniqueConstraint(columnNames = {"user_name"})}
)
public class User extends BaseEntity{

    @Column(name = "user_name", nullable = false, unique = true)
    private String userName;

    @Column(name = "password", nullable = false)
    private String password;

}
