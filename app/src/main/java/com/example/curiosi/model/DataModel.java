package com.example.curiosi.model;

public class DataModel {
    public int did;
    public String title;
    public String desc;
    public String image;

    public DataModel(){

    }

    public DataModel(String title, String desc, String image){
        this.title = title;
        this.desc = desc;
        this.image = image;
    }
}
