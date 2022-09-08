package com.pixel.taskmanager.enums;

import java.util.Arrays;

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

    public String getNameById(int id){

        for(Department dep: values()){
            if(dep.getId()==id){
                return dep.getName();
            }
        }
        return "";
    }


}
