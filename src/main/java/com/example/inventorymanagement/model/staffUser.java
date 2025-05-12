package com.example.inventorymanagement.model;

public class staffUser extends user {

    public staffUser(String userId, String username, String password, String email, String contactNumber) {
        super(userId, username, password, email, contactNumber);
    }

    @Override
    public String getRole(){
        return "Staff";
    }
}