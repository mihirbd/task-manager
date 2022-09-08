package com.pixel.taskmanager.enums;

public enum ProjectType {

    ITEM(1,"Company"),
    COMPANY(2,"Pixel Electric Company Ltd");

    private final int id;
    private  final String name;

    private ProjectType(int id, String name){
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

        for(ProjectType PT: values()){
            if(PT.getId()==id){
                return PT.getName();
            }
        }
        return "";
    }
}
