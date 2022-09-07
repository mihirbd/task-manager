package com.pixel.taskmanager.enums;

public enum Designation {

    MARKETER(1,"Marketer"),
    HRM(2,"Human Resource Manager"),
    ACCOUNTANT(3,"Accountant"),
    SOFTWARE_ENGINEER(4,"Software Engineer");

    private final int id;
    private  final String name;

    private Designation(int id, String name){
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
