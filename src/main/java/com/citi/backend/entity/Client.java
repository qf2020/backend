package com.citi.backend.entity;

public class Client {
    private int id;
    private String name;
    private String password;

    public Client(int userId, String userName, String password){
        this.id = userId;
        this.name = userName;
        this.password = password;
    }
}
