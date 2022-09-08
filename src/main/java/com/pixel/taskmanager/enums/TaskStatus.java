package com.pixel.taskmanager.enums;

public enum TaskStatus {
    NOT_READY(1,"Not Ready"),
    IN_PROGRESS(2,"In Progress"),
    DONE(3,"Done"),
    CLOSED(4,"Closed"),
    BLOCK(5,"block"),
    TODO(6,"To Do");

    private final int id;
    private  final String name;

    private TaskStatus(int id, String name){
        this.name=name;
        this.id=id;
    }

    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }

    public String getNameById(int id){

        for(TaskStatus TS: values()){
            if(TS.getId()==id){
                return TS.getName();
            }
        }
        return "";
    }

}
