package com.pixel.taskmanager.enums;

public enum TaskType {

    STORY(1,"Not Ready"),
    BUG(2,"Not Ready"),
    TASK(3,"Not Ready");

    private final int id;
    private  final String name;

    private TaskType(int id, String name){
        this.name=name;
        this.id=id;
    }

    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }

}
