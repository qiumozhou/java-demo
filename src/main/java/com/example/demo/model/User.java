package com.example.demo.model;

public class User {
    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    @Override
    public String toString(){
        return "user :"+name +","+"age";
    }
}
