package com.pixel.taskmanager.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Data
@Entity
@Table(name = "task")
public class Task  extends BaseEntity{

    @ManyToOne(cascade = CascadeType.REFRESH)
    private String project;

    @Column(name = "task_type", nullable = false)
    private Integer task_type;

    @Column(name = "task_status", nullable = false)
    private Integer task_status;

    @Column(name = "summary", nullable = false)
    private String summary;

    @Lob
    @Size(max = 65000, message = "Maximum 65000 kb allowed")
    @Column(name = "description", columnDefinition = "mediumblob")
    private String description;

    @ManyToOne(cascade = CascadeType.REFRESH)
    private Employee assign;

    @Column(name = "label", nullable = false)
    private String label;

    @Column(name = "story_point")
    private String story_point;

    @ManyToOne(cascade = CascadeType.REFRESH)
    private Employee reporter;

    @Lob
    @Size(max = 5242880, message = "Maximum 5242880 kb allowed")
    @Column(name = "attachment", columnDefinition = "mediumblob")
    private String attachment;

    @Column(name = "link_type")
    private String link_type;

    @OneToOne
    private Task linkedIssue;
}
