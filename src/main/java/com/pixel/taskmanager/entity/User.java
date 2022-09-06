package com.pixel.taskmanager.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="user")
//@UniqueConstraint(columnNames = new String("user_name") )
public class User extends BaseEntity{

    @Column(name = "user_name", nullable = false, unique = true)
    private String userName;

    @Column(name = "password", nullable = false)
    private String password;

}
