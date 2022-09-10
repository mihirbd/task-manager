package com.pixel.taskmanager.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@MappedSuperclass
@Data
public abstract class BaseEntity implements Serializable {
    private static final long  serialVersionUID= -1293869748369245789L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @Column(name = "is_active", nullable = false)
    private boolean is_Active;

    @Column(name = "is_approved", nullable = false)
    private boolean is_approved;


}
