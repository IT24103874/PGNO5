package com.example.inventorymanagement.model;

public class adminUser extends user {

    public adminUser(String userId, String username, String password, String email, String contactNumber) {
        super(userId, username, password, email, contactNumber);
    }

@Override
public String getRole(){
    return "admin";
}
}