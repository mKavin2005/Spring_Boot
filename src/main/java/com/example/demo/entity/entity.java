package com.example.demo.entity;

public class User {
    private int rollno;
    private String name;
    private String email;

    public User(int rollno, String name, String email) {
        this.name = name;
        this.rollno = rollno;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getRollno() {
        return rollno;
    }
}