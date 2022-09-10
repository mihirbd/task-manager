package com.pixel.taskmanager.enums;

public enum TaskType {

    STORY(1,"Story"),
    BUG(2,"Bug"),
    TASK(3,"Task");

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
    public String getNameById(int id){

        for(TaskType TT: values()){
            if(TT.getId()==id){
                return TT.getName();
            }
        }
        return "";
    }

}
