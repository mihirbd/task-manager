package com.pixel.taskmanager.enums;

public enum Department {

    MARKETING(1,"Marketing"),
    ACCOUNTANT(2,"Accountant"),
    PRODUCTION(3,"Production");

    private final int id;
    private  final String name;

    private Department(int id, String name){
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
