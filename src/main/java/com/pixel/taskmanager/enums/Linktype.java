package com.pixel.taskmanager.enums;

public enum Linktype {


    BLOCK(1,"Block"),
    CLONE(2,"Clone"),
    RELATE(3,"Relate"),
    DUPLICATE(4,"Duplicate");

    private final int id;
    private  final String name;

    private Linktype(int id, String name){
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
